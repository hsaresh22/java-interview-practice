package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    @Test
    void normalArray() {
        int[] nums = {0, 1, 0, 3, 12};
        MoveZeroes.solve(nums);
        assertArrayEquals(
                new int[]{1, 3, 12, 0, 0}, nums);
    }


    @Test
    void preservesNegativeNumbers() {
        int[] nums = {-3, 0, 2, -1};

        MoveZeroes.solve(nums);

        assertArrayEquals(
                new int[]{-3, 2, -1, 0},
                nums
        );
    }

    @Test
    void noZeroes() {
        int[] nums = {1, 2, 3};
        MoveZeroes.solve(nums);
        assertArrayEquals(
                new int[]{1, 2, 3}, nums);
    }

    @Test
    void allZeroes() {
        int[] nums = {0, 0, 0};
        MoveZeroes.solve(nums);
        assertArrayEquals(
                new int[]{0, 0, 0}, nums);
    }

    @Test
    void zeroesAtBeginning() {
        int[] nums = {0, 0, 1, 2};
        MoveZeroes.solve(nums);
        assertArrayEquals(
                new int[]{1, 2, 0, 0}, nums);
    }

    @Test
    void zeroesAtEnd() {
        int[] nums = {1, 2, 0, 0};
        MoveZeroes.solve(nums);
        assertArrayEquals(
                new int[]{1, 2, 0, 0}, nums);
    }

    @Test
    void emptyArray() {
        int[] nums = {};
        MoveZeroes.solve(nums);
        assertArrayEquals(new int[]{}, nums);
    }
}
