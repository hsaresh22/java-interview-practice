
package strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void basicAnagram() {
        assertTrue(ValidAnagram.solve(
                "anagram", "nagaram"));
    }

    @Test
    void notAnagram() {
        assertFalse(ValidAnagram.solve(
                "rat", "car"));
    }

    @Test
    void sameLettersDifferentFrequencies() {
        assertFalse(ValidAnagram.solve(
                "aab", "abb"));
    }

    @Test
    void differentLengths() {
        assertFalse(ValidAnagram.solve(
                "abc", "ab"));
    }

    @Test
    void repeatedLetters() {
        assertTrue(ValidAnagram.solve(
                "aabbcc", "ccbbaa"));
    }

    @Test
    void emptyStrings() {
        assertTrue(ValidAnagram.solve("", ""));
    }

    @Test
    void oneEmptyString() {
        assertFalse(ValidAnagram.solve("a", ""));
    }

    @Test
    void sameString() {
        assertTrue(ValidAnagram.solve(
                "hello", "hello"));
    }

    @Test
    void singleCharacter() {
        assertTrue(ValidAnagram.solve("z", "z"));
    }
}
