package exercisestest;

import com.cesarlead.hr.exercisestest.ExercisesTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExercisesTestTest {

    private final ExercisesTest ex = new ExercisesTest();

    @Test
    void reverseStringTest() {
        assertEquals("dcba", ex.reverseString("abcd"));
        assertEquals("aloh", ex.reverseString("hola"));
    }

    @Test
    void isPalindromeTest() {
        assertEquals("Is palindrome", ex.isPalindrome("lo ol"));
        assertEquals("Is not palindrome", ex.isPalindrome("hola"));
    }

    @Test
    void mostFrecuentCharTest() {
        assertEquals(' ', ex.mostFrecuentChar("hola"));
        assertEquals('a', ex.mostFrecuentChar("aaaabb"));
    }

    @Test
    void fizzBuzzTest() {
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n",
                ex.fizzBuzz(15));
    }

    @Test
    void twoSumTest() {
        assertArrayEquals(new int[]{0, 1}, ex.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 2}, ex.twoSum(new int[]{3, 2, 4}, 6));
    }
}
