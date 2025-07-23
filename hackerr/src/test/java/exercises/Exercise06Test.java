package exercises;

import com.cesarlead.hr.exercises.Exercise06;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise06Test {

    private final Exercise06 ex = new Exercise06();

    @Test
    void flipBits_deZero_debeDarAllOnes() {
        assertEquals(0xFFFFFFFFL, ex.flippingBits(0L));
    }

}
