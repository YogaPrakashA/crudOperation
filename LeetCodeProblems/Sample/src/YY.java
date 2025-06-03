import java.util.*;

public class YY {

    public static void main(String[] args) {
       int[] nums = {-1,0,1,2,-1,-4};
//        int[] nums = {0,0,0,0};

       System.out.println(getListOfInteger(nums));
    }

    public static List<List<Integer>> getListOfInteger(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Loop through each number and use two pointers
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for the first number
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for second and third numbers
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < target) {
                    left++; // Need a larger value
                } else {
                    right--; // Need a smaller value
                }
            }
        }

        return result;

//       List<List<Integer>> listOfInteger = new ArrayList<>();
//       Set<List<Integer>> listOfSet = new HashSet<>();
//        int sum = 0;
//            if(nums.length <=2)
//              return listOfInteger;
//
//            if(nums.length == 3){
//           sum = nums[0] + nums[1] + nums[2];
//                   if(sum == 0){
//            listOfInteger.add(Arrays.asList(nums[0], nums[1] ,nums[2]));
//        }
//                return listOfInteger;
//    }
//            // 1
//        for(int i = 0 ; i < nums.length-1; i++){
//        for(int j = i ; j < nums.length-2; j++){
//            System.out.println(nums[i] + ","+ nums[j+1] + "," + nums[j+2]);
//        if(nums[i] != nums[j+1] || nums[i] != nums[j+2] || nums[j+1] != nums[j+2]){
//          sum = nums[i] + nums[j+1]+ nums[j+2]; // 1 + 2 + -1
//           if(sum == 0){
//          listOfInteger.add(Arrays.asList(nums[i], nums[j+1] ,nums[j+2]));
//          }
//        }
//        }
//        }
//
//        return listOfInteger;

    }

}
