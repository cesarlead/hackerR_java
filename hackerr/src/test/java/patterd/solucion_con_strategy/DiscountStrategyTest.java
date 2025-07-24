package patterd.solucion_con_strategy;

import com.cesarlead.hr.patterd.strategy.solucion_con_strategy.DiscountStrategy;
import com.cesarlead.hr.patterd.strategy.solucion_con_strategy.FixedDiscount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiscountStrategyTest {

    @Test
    void discountFixedPriceTest() {
        DiscountStrategy discountStrategy = new FixedDiscount(30.00);
        assertEquals(70.00, discountStrategy.apply(100.00));
    }

    @Test
    void NoDiscountTest() {
        DiscountStrategy discountStrategy = new FixedDiscount(0.00);
        assertEquals(100.00, discountStrategy.apply(100.00));
    }

    @Test
    void discountPercentageTest() {
        DiscountStrategy discountStrategy = new FixedDiscount(30.00);
        assertEquals(70.00, discountStrategy.apply(100.00));
    }
}