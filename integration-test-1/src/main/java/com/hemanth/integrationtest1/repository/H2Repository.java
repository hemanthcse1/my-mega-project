package com.hemanth.integrationtest1.repository;

import com.hemanth.integrationtest1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface H2Repository extends JpaRepository<Product,Integer> {
}
