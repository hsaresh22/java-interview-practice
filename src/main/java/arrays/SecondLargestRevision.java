
package arrays;

import java.util.OptionalInt;

public class SecondLargestRevision {

    public static OptionalInt solve(int[] nums) {
        // Implement from memory

        if (nums.length==0) return OptionalInt.empty();
        var max = nums[0];
        var max2 = OptionalInt.empty();
        for (int i=1; i<nums.length;i++){
            if (nums[i]>max){
                max2 = OptionalInt.of(max);
                max = nums[i];
            }
            if (nums[i]<max && (max2.isEmpty() || nums[i]>max2.getAsInt())){
                max2 = OptionalInt.of(nums[i]);
            }

        }
        return max2;
    }
}
