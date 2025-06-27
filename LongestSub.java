
import java.util.*;

public class LongestSub {

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num); // add all elements to the set
        }

        int maxLength = 0;

        for (int num : nums) {
            // Only start if num-1 doesn't exist (start of a sequence)
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                if (currentStreak > maxLength) {
                    maxLength = currentStreak;
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int[] nums3 = {1, 0, 1, 2};

        System.out.println("Longest consecutive sequence length:");
        System.out.println("Example 1: " + longestConsecutive(nums1)); // Output: 4
        System.out.println("Example 2: " + longestConsecutive(nums2)); // Output: 9
        System.out.println("Example 3: " + longestConsecutive(nums3)); // Output: 3
    }
}
