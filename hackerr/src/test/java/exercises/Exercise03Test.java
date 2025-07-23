package exercises;

import com.cesarlead.hr.exercises.Exercise03;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise03Test {

    private final Exercise03 ex = new Exercise03();

    @Test
    void timeConversionTest() {
        assertEquals("07:05:45", ex.timeConversion("07:05:45AM"));
        assertEquals("19:05:45", ex.timeConversion("07:05:45PM"));
        assertEquals("12:05:45", ex.timeConversion("12:05:45PM"));
    }
}
