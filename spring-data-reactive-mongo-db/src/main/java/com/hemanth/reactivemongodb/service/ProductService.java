package com.hemanth.reactivemongodb.service;

import com.hemanth.reactivemongodb.dto.ProductDto;
import com.hemanth.reactivemongodb.entity.Product;
import com.hemanth.reactivemongodb.repository.ProductRepository;
import com.hemanth.reactivemongodb.util.ProductUtils;
import org.springframework.data.domain.Range;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Flux<ProductDto> getAllProducts() {
        return productRepository.findAll()
                .map(ProductUtils::entityToDTO);
    }

    public Mono<ProductDto> findProduct(String id) {
        return productRepository.findById(id)
                .map(ProductUtils::entityToDTO);
    }

    public Flux<ProductDto> findByPriceRange(double min, double max) {
        return productRepository.findByPriceBetween(Range.closed(min, max));
    }

    public Mono<ProductDto> saveProduct(Mono<ProductDto> productDtoMono) {
        return productDtoMono.map(ProductUtils::dtoToEntity)
                .flatMap(productRepository::insert)
                .map(ProductUtils::entityToDTO);
    }

    public Mono<ProductDto> updateProduct(Mono<ProductDto> productDtoMono, String id) {
        return productRepository.findById(id)
                .flatMap(p -> productDtoMono.map(ProductUtils::dtoToEntity)
                        .doOnNext(e -> e.setId(id)))
                .flatMap(productRepository::insert)
                .map(ProductUtils::entityToDTO);

    }

    public Mono<Void> deleteProduct(String id) {
        return productRepository.deleteById(id);
    }
}
