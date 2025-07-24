package com.cesarlead.hr.fundamentals_of_language.solucion_con_strategy;

import java.util.Objects;

public class DiscountCalculator {

    private final DiscountStrategy discountStrategy;

    public DiscountCalculator(DiscountStrategy strategy) {
        this.discountStrategy = Objects.requireNonNull(strategy, "strategy cannot be null");
    }

    public Double calculate(Double price) {
        if (price < 0) {
            throw new IllegalArgumentException("price must be greater than 0");
        }
        return discountStrategy.apply(price);
    }
}
