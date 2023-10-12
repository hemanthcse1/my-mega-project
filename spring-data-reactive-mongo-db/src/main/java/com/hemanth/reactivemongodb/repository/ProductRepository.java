package com.hemanth.reactivemongodb.repository;

import com.hemanth.reactivemongodb.dto.ProductDto;
import com.hemanth.reactivemongodb.entity.Product;
import org.springframework.data.domain.Range;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.List;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product, String> {


    Flux<ProductDto> findByPriceBetween(Range<Double> priceRange);

}
