package com.hemanth.integrationtest1;

import com.hemanth.integrationtest1.entity.Product;
import com.hemanth.integrationtest1.repository.H2Repository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProductControllerTest {

    @LocalServerPort
    private int port;

    private String baseUrl = "http://localhost";

    private static RestTemplate restTemplate;

    @BeforeAll
    public static void init() {
        restTemplate = new RestTemplate();
    }

    @Autowired
    private H2Repository h2Repository;

    @BeforeEach
    public void setUp() {
        baseUrl = baseUrl.concat(":").concat(port + "").concat("/api/product");
    }

    @Test
    public void testAddProduct() {
        Product product = new Product(1, "AirPods", 2000, 5);
        Product response = restTemplate.postForObject(baseUrl, product, Product.class);

        assertEquals("AirPods", response.getName());
        // assertEquals(1, h2Repository.findAll().size());
    }

    @Test
    @Sql(statements = "INSERT INTO product (id, name,price,qty) VALUES (6,'Phone',2,20000)", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
    @Sql(statements = "DELETE FROM product WHERE name='Phone'", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    public void getAllProductsTest() {

        List<Product> products = restTemplate.getForObject(baseUrl, List.class);
        assertEquals(1, products.size());

    }

    @Test
    @Sql(statements = "INSERT INTO product (id, name,price,qty) VALUES (8,'Car',2,20000)", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
    @Sql(statements = "DELETE FROM product WHERE name='Car'", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    public void findProductByIdTest() {

        Product product = restTemplate.getForObject(baseUrl + "/{id}", Product.class, 8);

        assertAll(
                () -> assertNotNull(product),
                () -> assertEquals(8,product.getId())
        );
    }

}
