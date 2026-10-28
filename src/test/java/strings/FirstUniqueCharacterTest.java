
package strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterTest {

    @Test
    void firstCharacterIsUnique() {
        assertEquals(0, FirstUniqueCharacter.solve("leetcode"));
    }

    @Test
    void uniqueCharacterInMiddle() {
        assertEquals(2, FirstUniqueCharacter.solve("loveleetcode"));
    }

    @Test
    void noUniqueCharacters() {
        assertEquals(-1, FirstUniqueCharacter.solve("aabb"));
    }

    @Test
    void singleCharacter() {
        assertEquals(0, FirstUniqueCharacter.solve("a"));
    }

    @Test
    void emptyString() {
        assertEquals(-1, FirstUniqueCharacter.solve(""));
    }

    @Test
    void allCharactersUnique() {
        assertEquals(0, FirstUniqueCharacter.solve("abcdef"));
    }

    @Test
    void uniqueCharacterAtEnd() {
        assertEquals(4, FirstUniqueCharacter.solve("aabbc"));
    }

    @Test
    void multipleUniqueCharacters() {
        assertEquals(4, FirstUniqueCharacter.solve("aabbcdeffg"));
    }

    @Test
    void repeatedCharactersWithOneUnique() {
        assertEquals(6, FirstUniqueCharacter.solve("aabbccdxxyy"));
    }

    @Test
    void longRepeatedPrefix() {
        assertEquals(6, FirstUniqueCharacter.solve("aabbccd"));
    }
}
