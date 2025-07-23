package exercises;

import com.cesarlead.hr.exercises.Exercise05;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise05Test {

    private final Exercise05 ex = new Exercise05();

    @Test
    void lonelyIntegerTest() {
        assertEquals(4, ex.lonelyInteger(new int[]{1, 2, 3, 4, 3, 2, 1}));
        assertEquals(10, ex.lonelyInteger(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}));
    }
}
