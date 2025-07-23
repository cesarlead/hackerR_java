package exercises;

import com.cesarlead.hr.exercises.Exercise07;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise07Test {

    private final Exercise07 ex = new Exercise07();

    @Test
    void diagonalDifferenceTest() {
        assertEquals(2, ex.diagonalDifference(new int[][]{{1, 2, 3}, {4, 5, 6}, {9, 8, 9}}));
        assertEquals(15, ex.diagonalDifference(new int[][]{{11, 2, 4}, {4, 5, 6}, {10, 8, -12}}));
    }

}

