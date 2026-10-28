package arrays;

import java.util.OptionalInt;

public class SecondLargest {

    //Write a Java method that returns the second-largest distinct number in an integer array.
//Requirements
//- Do not sort the array.
//- Aim for O(n) time complexity.
//- Handle duplicate numbers.
//- Return OptionalInt.empty() if fewer than two distinct numbers exist.
    public static OptionalInt solve(int[] nums) {
        // Your implementation
        if (nums.length == 0) {
            return OptionalInt.empty();
        }
        var largestNum = nums[0];
        var secondLargestNum = OptionalInt.empty();


        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            if (num > largestNum) {
                secondLargestNum = OptionalInt.of(largestNum);
                largestNum = num;
            } else if (num < largestNum && (secondLargestNum.isEmpty() || num > secondLargestNum.getAsInt())) {
                secondLargestNum = OptionalInt.of(num);
            }
        }


        return secondLargestNum;
    }
}
  