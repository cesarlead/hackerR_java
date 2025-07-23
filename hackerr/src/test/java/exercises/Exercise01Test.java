package exercises;

import com.cesarlead.hr.exercises.Exercise01;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise01Test {

    private final Exercise01 exercise01 = new Exercise01();

    @Test
    void plusMinusTest() {
        assertEquals("0.400000\n0.400000\n0.200000", exercise01.plusMinus(new int[]{1, 1, 0, -1, -1}));
        assertEquals("1.000000\n0.000000\n0.000000", exercise01.plusMinus(new int[]{1, 2, 3, 4, 5}));
        assertEquals("0.500000\n0.333333\n0.166667",
                exercise01.plusMinus(new int[]{-4, 3, -9, 0, 4, 1}));
    }


}
