package it.epicode.springintro.entities;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.StringJoiner;

@Slf4j
public abstract class BaseEntity {
    private int calories;
    private double price;

    public BaseEntity(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }

    public BaseEntity (double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BaseEntity.class.getSimpleName() + "[", "]")
                .add("calories=" + calories)
                .add("price=" + price)
                .toString();
    }
}
