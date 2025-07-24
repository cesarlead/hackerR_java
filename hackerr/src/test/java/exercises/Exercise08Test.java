package exercises;

import com.cesarlead.hr.exercises.Exercise08;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Exercise08Test {

    private final Exercise08 ex = new Exercise08();

    @Test
    void countingSortTest() {
        assertArrayEquals(new int[]{0, 3, 1, 1},
                ex.countingSort(new int[]{1, 1, 2, 3, 1}));
    }
}
