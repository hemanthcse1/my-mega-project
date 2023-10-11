package com.hemanth.springreactiveprogramming.service;

import com.hemanth.springreactiveprogramming.dao.CustomerDao;
import com.hemanth.springreactiveprogramming.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class CustomerService {


    private final CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public List<Customer> loadAllCustomers() {
        long start = System.currentTimeMillis();
        List<Customer> allCustomers = customerDao.getAllCustomers();
        long end = System.currentTimeMillis();
        System.out.println("Total execution time -> " + (end - start));
        return allCustomers;

    }

    public Flux<Customer> loadAllStreamCustomers() {
        long start = System.currentTimeMillis();
        Flux<Customer> allCustomersStream = customerDao.getAllCustomersStream();
        long end = System.currentTimeMillis();
        System.out.println("Total execution time -> " + (end - start));
        return allCustomersStream;

    }
}
