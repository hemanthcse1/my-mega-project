package com.hemanth.springreactiveprogramming.handler;

import com.hemanth.springreactiveprogramming.dao.CustomerDao;
import com.hemanth.springreactiveprogramming.dto.Customer;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerHandler {


    private final CustomerDao customerDao;

    public CustomerHandler(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public Mono<ServerResponse> loadCustomers(ServerRequest serverRequest) {
        Flux<Customer> customers = customerDao.getCustomer();
        return ServerResponse.ok().body(customers, Customer.class);
    }

    public Mono<ServerResponse> findCustomer(ServerRequest request) {
        int customerId = Integer.valueOf(request.pathVariable("input"));
        Mono<Customer> customerMono = customerDao.getCustomer()
                .filter(e -> e.getId() == customerId)
                .next();

        return ServerResponse.ok().body(customerMono, Customer.class);

    }

    public Mono<ServerResponse> saveCustomer(ServerRequest request) {
        Mono<Customer> customerMono = request.bodyToMono(Customer.class);
        Mono<String> saveResponse = customerMono.map(dto -> dto.getId() + " --- " + dto.getName());
        return ServerResponse.ok().body(saveResponse, String.class);
    }
}
