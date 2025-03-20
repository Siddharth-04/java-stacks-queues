import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int leftSum = target - nums[i];
            if (map.containsKey(leftSum)) {
                ans[0] = map.get(leftSum);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i], i);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
//[0, 1]