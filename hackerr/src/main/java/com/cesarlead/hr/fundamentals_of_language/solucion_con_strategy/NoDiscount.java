package com.cesarlead.hr.fundamentals_of_language.solucion_con_strategy;

public class NoDiscount implements DiscountStrategy {
    @Override
    public Double apply(Double price) {
        return price;
    }
}
