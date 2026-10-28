
package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private void assertPair(
            int[] nums, int target,
            int first, int second) {

        int[] result = TwoSum.solve(nums, target);

        assertEquals(2, result.length);
        assertNotEquals(result[0], result[1]);

        boolean correct =
                (result[0] == first && result[1] == second) ||
                        (result[0] == second && result[1] == first);

        assertTrue(correct, "Incorrect indices");
    }

    @Test
    void basicCase() {
        assertPair(new int[]{2, 7, 11, 15}, 9, 0, 1);
    }

    @Test
    void differentPositions() {
        assertPair(new int[]{3, 2, 4}, 6, 1, 2);
    }

    @Test
    void duplicateValues() {
        assertPair(new int[]{3, 3}, 6, 0, 1);
    }

    @Test
    void negativeNumbers() {
        assertPair(new int[]{-3, 4, 3, 90}, 0, 0, 2);
    }

    @Test
    void zeroTarget() {
        assertPair(new int[]{0, 4, 0}, 0, 0, 2);
    }

    @Test
    void twoElements() {
        assertPair(new int[]{5, 8}, 13, 0, 1);
    }
}
