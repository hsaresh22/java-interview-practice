package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZeroesRevisionTest {

    @Test
    void normalArray() {
        int[] nums = {0, 1, 0, 3, 12};
        MoveZeroesRevision.solve(nums);
        assertArrayEquals(
                new int[]{1, 3, 12, 0, 0}, nums);
    }


    @Test
    void preservesNegativeNumbers() {
        int[] nums = {-3, 0, 2, -1};

        MoveZeroesRevision.solve(nums);

        assertArrayEquals(
                new int[]{-3, 2, -1, 0},
                nums
        );
    }

    @Test
    void noZeroes() {
        int[] nums = {1, 2, 3};
        MoveZeroesRevision.solve(nums);
        assertArrayEquals(
                new int[]{1, 2, 3}, nums);
    }

    @Test
    void allZeroes() {
        int[] nums = {0, 0, 0};
        MoveZeroesRevision.solve(nums);
        assertArrayEquals(
                new int[]{0, 0, 0}, nums);
    }

    @Test
    void zeroesAtBeginning() {
        int[] nums = {0, 0, 1, 2};
        MoveZeroesRevision.solve(nums);
        assertArrayEquals(
                new int[]{1, 2, 0, 0}, nums);
    }

    @Test
    void zeroesAtEnd() {
        int[] nums = {1, 2, 0, 0};
        MoveZeroesRevision.solve(nums);
        assertArrayEquals(
                new int[]{1, 2, 0, 0}, nums);
    }

    @Test
    void emptyArray() {
        int[] nums = {};
        MoveZeroesRevision.solve(nums);
        assertArrayEquals(new int[]{}, nums);
    }
}
