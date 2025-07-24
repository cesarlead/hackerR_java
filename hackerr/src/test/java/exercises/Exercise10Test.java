package exercises;

import com.cesarlead.hr.exercises.Exercise10;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise10Test {

    private final Exercise10 ex = new Exercise10();

    @Test
    void permutingTwoArraysTest() {
        assertEquals("SI", ex.permutingTwoArrays(4, new Integer[]{1, 2, 3}, new Integer[]{3, 6, 10}));
        assertEquals("NO", ex.permutingTwoArrays(10, new Integer[]{2, 1, 3}, new Integer[]{3, 6, 11}));
    }
}
