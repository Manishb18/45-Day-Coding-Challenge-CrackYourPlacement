import java.util.*;

class FourSum {
    public static void main(String[] args) {
        int arr[] = {2,1,0,-1,2};
        int target = 0;

        System.out.print(fourSum(arr, target));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i< nums.length-3; i++){
            for(int j = i+1; j<nums.length-2; j++){
                int low = j+1, high = nums.length-1;
                while(low < high){
                    int sum = nums[i]+nums[j]+nums[low]+nums[high];
                    if(nums[i] > 0 && nums[j] >0 && nums[low] > 0 && nums[high] >  0 && sum < 0)
                        return res;

                    if(sum == target){
                        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        if(!res.contains(arr)){
                            res.add(arr);
                        }
                        low++;
                        high--;
                    }
                    else if(sum < target){
                        low++;
                    }
                    else{
                        high--;
                    }
                }
            }
        }
        return res;
    }
}
