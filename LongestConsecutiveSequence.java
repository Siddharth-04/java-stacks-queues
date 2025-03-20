import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Map<Integer, Boolean> numMap = new HashMap<>();
        for (int num : nums) {
            numMap.put(num, true);
        }

        int longestStreak = 0;

        for (int num : nums) {
            if (!numMap.containsKey(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numMap.containsKey(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        int [] nums = {100,4,200,1,3,2};
        int ans = longestConsecutive(nums);
        System.out.println(ans);
    }
}
