package it.epicode.springintro.entities;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.StringJoiner;

@Slf4j

public class Topping extends BaseEntity {
    private String name;

    public Topping(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    public Topping (String name, double price) {
        super(price);
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Topping.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .toString();
    }
}
