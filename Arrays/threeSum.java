import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int low = i+1;
            int high = nums.length-1;
            while(low < high){
                int sum = nums[i] + nums[low]+nums[high];

                if(sum == 0){
                    result.add(new ArrayList(Arrays.asList(nums[i], nums[low], nums[high])));
                    while(low < high && nums[low] == nums[low + 1]){
                        low++;
                    }

                    while(high > low && nums[high] == nums[high-1]){
                        high--;
                    }
                    low++;
                    high--;
                }
                else if (sum >  0){
                    high--;
                }
                else{
                    low++;
                }
            }
        }
        return result;
    }
}
