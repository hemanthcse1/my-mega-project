package com.hemanth.integrationtest1.controller;

import com.hemanth.integrationtest1.entity.Product;
import com.hemanth.integrationtest1.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {


    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


   /* @PostMapping
    public ResponseEntity<Product> saveProduct(@Validated @RequestBody Product product){
        return ResponseEntity.ok(productService.saveProduct(product));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Integer id){
        return ResponseEntity.ok(productService.getProduct(id));
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts(){
        return ResponseEntity.ok(productService.findAll());
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Product> updateProduct(@Validated @RequestBody Product product, @PathVariable("id") Integer id){
        return ResponseEntity.ok(productService.updateProduct(product,id));
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteProduct(@PathVariable("id") Integer id){
        productService.deleteProduct(id);
    }*/

    @PostMapping
    public ResponseEntity<Product> saveProduct(@Validated @RequestBody Product product){
        return ResponseEntity.ok(productService.saveProduct(product));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Integer id){
        return ResponseEntity.ok(productService.getProduct(id));
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts(){
        return ResponseEntity.ok(productService.findAll());
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Product> updateProduct(@Validated @RequestBody Product product, @PathVariable("id") Integer id){
        return ResponseEntity.ok(productService.updateProduct(product,id));
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteProduct(@PathVariable("id") Integer id){
        productService.deleteProduct(id);
    }
}
