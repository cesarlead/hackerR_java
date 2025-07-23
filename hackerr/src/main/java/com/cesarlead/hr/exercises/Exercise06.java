package com.cesarlead.hr.exercises;


// Flipping bits
public class Exercise06 {

    private static final long UINT32_MASK = 0xFFFFFFFFL;

    public Long flippingBits(Long n) {
        if (n < 0 || n > UINT32_MASK) {
            throw new IllegalArgumentException(
                    String.format("El valor debe estar en [0..%d], pero fue %d", UINT32_MASK, n)
            );
        }

        return (~n) & UINT32_MASK;
    }
}
