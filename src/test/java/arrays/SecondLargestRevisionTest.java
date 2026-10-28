package arrays;

import org.junit.jupiter.api.Test;

import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecondLargestRevisionTest {

    @Test
    void normalArray() {
        assertEquals(OptionalInt.of(7),
                SecondLargestRevision.solve(
                        new int[]{4, 7, 2, 9, 7, 5}));
    }

    @Test
    void allDuplicates() {
        assertEquals(OptionalInt.empty(),
                SecondLargestRevision.solve(
                        new int[]{5, 5, 5}));
    }

    @Test
    void negativeNumbers() {
        assertEquals(OptionalInt.of(-5),
                SecondLargestRevision.solve(
                        new int[]{-10, -5, -1}));
    }

    @Test
    void twoDistinctNumbers() {
        assertEquals(OptionalInt.of(3),
                SecondLargestRevision.solve(
                        new int[]{8, 3}));
    }

    @Test
    void emptyArray() {
        assertEquals(OptionalInt.empty(),
                SecondLargestRevision.solve(new int[]{}));
    }

    @Test
    void handlesIntegerBoundaries() {
        assertEquals(OptionalInt.of(Integer.MIN_VALUE),
                SecondLargestRevision.solve(
                        new int[]{Integer.MAX_VALUE,
                                Integer.MIN_VALUE}));
    }
}
