package com.cesarlead.hr.patterd.strategy.solucion_con_strategy;

public class NoDiscount implements DiscountStrategy {
    @Override
    public Double apply(Double price) {
        return price;
    }
}
