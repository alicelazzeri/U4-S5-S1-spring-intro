package it.epicode.springintro.entities;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.StringJoiner;

@Slf4j

public class Drink extends BaseEntity {
    private String name;

    public Drink(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Drink.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .toString();
    }
}
