package com.hemanth.springreactiveprogramming;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static java.lang.System.out;

public class MonoFluxTest {

    @Test
    public void testMono() {
        Mono<?> monoString = Mono.just("helloHemanth")
                .then(Mono.error(new RuntimeException("New error occurred")))
                .log();
        monoString.subscribe(out::println, (e) -> out.println(e.getMessage()));
    }


    @Test
    public void testFlux() {
        Flux<String> stringFlux = Flux.just("Java", "Hibernate", "Spring boot", "Microservers", "Architect")
                .concatWithValues("Cloud computing")
                .concatWith(Flux.error(new RuntimeException("Exception occurred in flux")))
                .concatWithValues("AWS")
                .log();
        stringFlux.subscribe(out::println, (e) -> System.out.println(e.getMessage()));
    }
}
