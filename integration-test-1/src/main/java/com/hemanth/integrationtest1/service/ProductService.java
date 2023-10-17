package com.hemanth.integrationtest1.service;

import com.hemanth.integrationtest1.entity.Product;
import com.hemanth.integrationtest1.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Product getProduct(Integer id) {
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product updateProduct(Product product, Integer id) {
        Product existingProduct = productRepository.findById(id).orElse(null);
        if (existingProduct != null) {
            existingProduct.setId(id);
            existingProduct.setName(product.getName());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setQty(product.getQty());

            Product updatedProduct = productRepository.save(existingProduct);
            return updatedProduct;
        }
        return null;
    }

    public void deleteProduct(Integer id) {
        Product product = productRepository.findById(id).orElse(null);

        if (product != null) {
            productRepository.delete(product);
        }else {
            throw new RuntimeException("product not found with id");
        }
    }
}
