
package strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void simplePalindrome() {
        assertTrue(ValidPalindrome.solve("racecar"));
    }

    @Test
    void palindromeWithPunctuation() {
        assertTrue(ValidPalindrome.solve(
                "A man, a plan, a canal: Panama"));
    }

    @Test
    void notPalindrome() {
        assertFalse(ValidPalindrome.solve("race a car"));
    }

    @Test
    void emptyString() {
        assertTrue(ValidPalindrome.solve(""));
    }

    @Test
    void spacesOnly() {
        assertTrue(ValidPalindrome.solve("   "));
    }

    @Test
    void caseInsensitive() {
        assertTrue(ValidPalindrome.solve("MadAm"));
    }

    @Test
    void numbersAndLetters() {
        assertFalse(ValidPalindrome.solve("0P"));
    }

    @Test
    void numericPalindrome() {
        assertTrue(ValidPalindrome.solve("12321"));
    }

    @Test
    void punctuationOnly() {
        assertTrue(ValidPalindrome.solve("!@#$"));
    }

    @Test
    void singleCharacter() {
        assertTrue(ValidPalindrome.solve("a"));
    }
}
