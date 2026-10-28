package arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean solve(int[] nums) {
        // Implement independently
        Set<Integer> set = new HashSet<>();
        for (int num:nums){
            if (!set.add(num)){
                return true;
            }
        }

        return false;
    }


//    public static boolean solve(int[] nums) {
//        // Your implementation here
//        Set<Integer> set = new HashSet<>();
//
//        for (int num : nums) {
//            if (!set.add(num)) {
//                return true;
//            }
//        }
//        return false;
//    }
}
