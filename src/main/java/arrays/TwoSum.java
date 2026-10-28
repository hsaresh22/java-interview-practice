package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public static int[] solve(int[] nums, int target) {

        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0;i< nums.length;i++){
            var complement = target - nums[i];
            if (seen.containsKey(complement)){
                return new int[]{seen.get(complement),i};
            }
            seen.put(nums[i], i);
        }


        return new int[]{};
    }

}








//HashMap<Integer, Integer> seen = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//
//int complement = target - nums[i];
//
//// TODO: Check if we've seen the complement.
//// If yes, return the matching indices.
//            if (seen.containsKey(complement)){
//        return new int[]{i,seen.get(complement)};
//        }
//
//        // TODO: Otherwise, remember the current
//        // number and its index.
//        seen.put(nums[i],i);
//        }
