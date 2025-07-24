package com.cesarlead.hr.patterd.strategy.solucion_con_strategy;

public class FixedDiscount implements DiscountStrategy {

    private final Double value;

    public FixedDiscount(Double value) {
        if (value < 0) {
            throw new IllegalArgumentException("value must be greater than 0");
        }
        this.value = value;
    }


    @Override
    public Double apply(Double price) {
        return Math.max(0, price - value);
    }
}
