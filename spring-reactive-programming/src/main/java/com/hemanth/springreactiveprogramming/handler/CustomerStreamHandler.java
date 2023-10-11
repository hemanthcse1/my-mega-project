package com.hemanth.springreactiveprogramming.handler;

import com.hemanth.springreactiveprogramming.dao.CustomerDao;
import com.hemanth.springreactiveprogramming.dto.Customer;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerStreamHandler {

    private final CustomerDao customerDao;

    public CustomerStreamHandler(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }


    public Mono<ServerResponse> getCustomers(ServerRequest serverRequest) {
        Flux<Customer> allCustomersStream = customerDao.getAllCustomersStream();
        return ServerResponse.ok()
                .contentType(MediaType.TEXT_EVENT_STREAM)
                .body(allCustomersStream, Customer.class);
    }
}
