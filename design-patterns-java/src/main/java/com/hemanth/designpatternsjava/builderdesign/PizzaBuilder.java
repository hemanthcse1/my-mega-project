package com.hemanth.designpatternsjava.builderdesign;

import java.util.Arrays;
import java.util.List;

public class PizzaBuilder {

    private String size;
    private String crust;
    private String sauce;
    private List<String> toppings;

    public PizzaBuilder(String size) {
        this.size = size;
    }

    public PizzaBuilder crust(String value) {
        crust = value;
        return this;
    }

    public PizzaBuilder sauce(String value) {
        sauce = value;
        return this;
    }

    public PizzaBuilder toppings(String... values) {
        toppings = Arrays.asList(values);
        return this;
    }

    public Pizza buildPizza(){
        return new Pizza(size,crust,sauce,toppings);
    }
}
