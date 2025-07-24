package com.cesarlead.hr.fundamentals_of_language.solucion_con_strategy;

public class PercentageDiscount implements DiscountStrategy {

    private final Double percentage;

    public PercentageDiscount(Double percentage) {
        if (percentage < 0 || percentage > 0.30) {
            throw new IllegalArgumentException("percentage must be between 0 and 0.30");
        }
        this.percentage = percentage;
    }

    @Override
    public Double apply(Double price) {
        return price * (1 - percentage / 100);
    }
}
