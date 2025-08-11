import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 15, 11, 7};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int value  = 0;
        for (int i = 0; i < nums.length; i++) {
            value = target - nums[i];
            if(map.containsKey(value))
              return new int[]{value, nums[i]};

            map.put(nums[i], i);
        }
        return new int[]{};
    }
}