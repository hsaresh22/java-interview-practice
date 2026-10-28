
package arrays;

public class MoveZeroesRevision {

    public static void solve(int[] nums) {
        // Implement from memory
        var write = 0;
        for (int i = 0; i < nums.length; i++) {
            var value = nums[i];
            if (value!=0) {
                nums[write] = value;
                write++;
            }
        }

        for (int i = write; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
