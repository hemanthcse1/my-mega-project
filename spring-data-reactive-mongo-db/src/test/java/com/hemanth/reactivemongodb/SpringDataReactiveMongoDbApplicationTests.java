package com.hemanth.reactivemongodb;

import com.hemanth.reactivemongodb.controller.ProductController;
import com.hemanth.reactivemongodb.dto.ProductDto;
import com.hemanth.reactivemongodb.service.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;


import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;


@ExtendWith(SpringExtension.class)
@WebFluxTest(ProductController.class)
class SpringDataReactiveMongoDbApplicationTests {

    @Autowired
    private WebTestClient webTestClient;

    @MockBean
    private ProductService productService;

    @Test
    public void addProductTest() {
        Mono<ProductDto> productDtoMono = Mono.just(new ProductDto("101", "Mobile", 10, 10000));
        when(productService.saveProduct(productDtoMono)).thenReturn(productDtoMono);

        webTestClient.post()
                .uri("/item")
                .body(Mono.just(productDtoMono), ProductDto.class)
                .exchange()
                .expectStatus().isOk();
    }

    @Test
    public void getProducts() {
        Flux<ProductDto> productDtoFlux = Flux.just(new ProductDto("101", "Mobile", 10, 10000),
                new ProductDto("102", "Laptop", 5, 1299));

        when(productService.getAllProducts()).thenReturn(productDtoFlux);

        Flux<ProductDto> responseBody = webTestClient.get()
                .uri("/item/all")
                .exchange()
                .expectStatus().isOk()
                .returnResult(ProductDto.class)
                .getResponseBody();

        StepVerifier.create(responseBody)
                .expectSubscription()
                .expectNext(new ProductDto("101", "Mobile", 10, 10000))
                .expectNext(new ProductDto("102", "Laptop", 5, 1299))
                .verifyComplete();
    }


    @Test
    public void getProductTest() {
        Mono<ProductDto> productDtoMono = Mono.just(new ProductDto("101", "Mobile", 10, 10000));

        when(productService.findProduct(any())).thenReturn(productDtoMono);

        Flux<ProductDto> responseBody = webTestClient.get()
                .uri("/item/101")
                .exchange()
                .expectStatus().isOk()
                .returnResult(ProductDto.class)
                .getResponseBody();


        StepVerifier.create(responseBody)
                .expectSubscription()
                .expectNextMatches(p -> p.getName().equals("Mobile"))
                .verifyComplete();
    }

    @Test
    public void UpdateProductTest() {
        Mono<ProductDto> productDtoMono = Mono.just(new ProductDto("101", "Mobile", 10, 10000));
        when(productService.updateProduct(productDtoMono, "101")).thenReturn(productDtoMono);

        webTestClient.put()
                .uri("/item/update/101")
                .body(Mono.just(productDtoMono), ProductDto.class)
                .exchange()
                .expectStatus().isOk();
    }

    @Test
    public void deleteProductTest() {

        Mono<ProductDto> productDtoMono = Mono.just(new ProductDto("101", "Mobile", 10, 10000));

        given(productService.deleteProduct(any())).willReturn(Mono.empty());

        webTestClient.delete()
                .uri("/item/delete/101")
                .exchange()
                .expectStatus().isOk();

    }

}
