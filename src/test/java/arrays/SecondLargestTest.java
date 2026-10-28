package arrays;

import org.junit.jupiter.api.Test;
import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.*;

class SecondLargestTest {

    @Test
    void normalArray() {
        assertEquals(OptionalInt.of(7),
                SecondLargest.solve(
                        new int[]{4, 7, 2, 9, 7, 5}));
    }

    @Test
    void allDuplicates() {
        assertEquals(OptionalInt.empty(),
                SecondLargest.solve(
                        new int[]{5, 5, 5}));
    }

    @Test
    void negativeNumbers() {
        assertEquals(OptionalInt.of(-5),
                SecondLargest.solve(
                        new int[]{-10, -5, -1}));
    }

    @Test
    void twoDistinctNumbers() {
        assertEquals(OptionalInt.of(3),
                SecondLargest.solve(
                        new int[]{8, 3}));
    }

    @Test
    void emptyArray() {
        assertEquals(OptionalInt.empty(),
                SecondLargest.solve(new int[]{}));
    }

    @Test
    void handlesIntegerBoundaries() {
        assertEquals(OptionalInt.of(Integer.MIN_VALUE),
                SecondLargest.solve(
                        new int[]{Integer.MAX_VALUE,
                                Integer.MIN_VALUE}));
    }
}
