package com.hemanth.designpatternsjava.builderdesign;

public class PizzaClient {

    public static void main(String[] args) {


        Pizza pizza1 = new PizzaBuilder("large").crust("thin").toppings("cheese", "onions").buildPizza();
        System.out.println(pizza1);


        Pizza pizza2 = new PizzaBuilder("Medium").crust("thick").sauce("tomato mint sauce").toppings("cheese, onion").buildPizza();
        System.out.println(pizza2);
    }
}
