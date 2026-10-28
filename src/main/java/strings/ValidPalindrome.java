
package strings;

public class ValidPalindrome {


    public static boolean solve(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Skip invalid character on the left
            if (!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }

            // Skip invalid character on the right
            if (!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }

            // Compare valid characters ignoring case
            if (Character.toLowerCase(s.charAt(left)) !=
                    Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            // Move both pointers inward
            left++;
            right--;
        }

        return true;
    }

}
