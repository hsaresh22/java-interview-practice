package arrays;

public class MoveZeroes {

    public static void solve(int[] nums) {
        // Your implementation here
        int write = 0;

        // Step 1:
        // Traverse the entire array.
        // Copy each non-zero element to nums[write].
        // Advance write only when copying a non-zero.
        for (int i =0;i<nums.length;i++){
            if (nums[i]!=0){
                nums[write] = nums[i];
                write++;
            }
        }

        // Step 2:
        // Starting at write, fill the remaining
        // positions with zero.
        for (int i=write;i< nums.length;i++){
            nums[i] = 0;
        }
    }
}
