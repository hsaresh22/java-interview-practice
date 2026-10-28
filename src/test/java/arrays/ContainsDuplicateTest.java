
package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void duplicateExists() {
        assertTrue(ContainsDuplicate.solve(
                new int[]{1, 2, 3, 1}));
    }

    @Test
    void allDistinct() {
        assertFalse(ContainsDuplicate.solve(
                new int[]{1, 2, 3, 4}));
    }

    @Test
    void multipleDuplicates() {
        assertTrue(ContainsDuplicate.solve(
                new int[]{1, 2, 3, 2, 1}));
    }

    @Test
    void negativeDuplicates() {
        assertTrue(ContainsDuplicate.solve(
                new int[]{-1, 2, -1}));
    }

    @Test
    void duplicateZeroes() {
        assertTrue(ContainsDuplicate.solve(
                new int[]{0, 0, 3}));
    }

    @Test
    void emptyArray() {
        assertFalse(ContainsDuplicate.solve(
                new int[]{}));
    }

    @Test
    void singleElement() {
        assertFalse(ContainsDuplicate.solve(
                new int[]{5}));
    }

    @Test
    void inputUnchanged() {
        int[] nums = {3, 1, 2, 3};
        int[] original = nums.clone();

        ContainsDuplicate.solve(nums);

        assertArrayEquals(original, nums);
    }
}
