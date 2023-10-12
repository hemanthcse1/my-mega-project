package com.hemanth.reactivemongodb.controller;

import com.hemanth.reactivemongodb.dto.ProductDto;
import com.hemanth.reactivemongodb.service.ProductService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public Flux<ProductDto> findAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Mono<ProductDto> findProductById(@PathVariable String id) {
        return productService.findProduct(id);
    }

    @GetMapping("/price-range")
    public Flux<ProductDto> findProductsByRange(@RequestParam("min") double min, @RequestParam("max") double max) {
        return productService.findByPriceRange(min, max);
    }

    @PostMapping
    public Mono<ProductDto> saveProduct(@RequestBody Mono<ProductDto> productDto) {
        System.out.println("Controller method called");
        return productService.saveProduct(productDto);
    }

    @PutMapping("/update/{id}")
    public Mono<ProductDto> updateProduct(@RequestBody Mono<ProductDto> productDtoMono, @PathVariable("id") String id) {
        return productService.updateProduct(productDtoMono, id);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> deleteProduct(@PathVariable("id") String id) {
        return productService.deleteProduct(id);
    }


}
