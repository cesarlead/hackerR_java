package exercises;

import com.cesarlead.hr.exercises.Exercise02;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise02Test {

    private final Exercise02 ex = new Exercise02();

    @Test
    void minMaxSumTest() {
        assertEquals("113 192", ex.miniMaxSum(new int[]{1, 2, 33, 3, 4, 5, 45, 20, 80}));
        assertEquals("10 14", ex.miniMaxSum(new int[]{1, 2, 3, 4, 5}));
    }
}
