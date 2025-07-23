package exercises;

import com.cesarlead.hr.exercises.Exercise04;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Exercise04Test {

    private final Exercise04 ex = new Exercise04();

    @Test
    @DisplayName("Cuenta correctamente cuántas veces aparece cada query")
    void matchingStringsTest() {

        String[] strings = {
                "aba", "baba", "aba", "xzxb", "ab", "aba"
        };
        String[] queries = {
                "aba", "xzxb", "ab", "noExiste"
        };

        int[] expected = {3, 1, 1, 0};

        int[] actual = ex.matchingStrings(strings, queries);

        assertArrayEquals(
                expected,
                actual,
                "El conteo de ocurrencias debe coincidir con el esperado"
        );

    }
}
