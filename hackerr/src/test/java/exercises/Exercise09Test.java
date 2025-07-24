package exercises;

import com.cesarlead.hr.exercises.Exercise09;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise09Test {

    private final Exercise09 ex = new Exercise09();

    @Test
    void parangramsTest() {
        assertEquals("pangram", ex.paragrams("The quick brown fox jumps over the lazy dog."));
        assertEquals("not pangram", ex.paragrams("The quick brown fox jumps over the lazy cat."));
    }
}
