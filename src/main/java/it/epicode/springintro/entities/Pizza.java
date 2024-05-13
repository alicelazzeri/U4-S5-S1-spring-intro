package it.epicode.springintro.entities;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.StringJoiner;

@Slf4j

public class Pizza extends BaseEntity {
    private String name;
    private List<Topping> toppings;

    public Pizza(String name, int calories, double price, List<Topping> toppings) {
        super(calories, price);
        this.name = name;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Pizza.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("toppings=" + toppings)
                .toString();
    }
}
