package com.hemanth.springreactiveprogramming.controller;

import com.hemanth.springreactiveprogramming.dto.Customer;
import com.hemanth.springreactiveprogramming.service.CustomerService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    /*
    * this is a traditional way of emitting data
    * */
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.loadAllCustomers();
    }

    /*
    * using reactive programming,
    * it will emmit the data as data is prepared to consume instead of waiting for whole data is ready to produce at single shot
    * */
    @GetMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Customer> getAllCustomersStream() {
        return customerService.loadAllStreamCustomers();
    }
}
