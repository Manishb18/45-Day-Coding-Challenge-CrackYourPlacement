import java.util.ArrayList;
import java.util.List;

public class findAllDupsInArray {
     static List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            int elem = Math.abs(nums[i]);
            if(nums[elem-1] < 0){
                arr.add(Math.abs(nums[i]));
            }
            else{
                nums[elem-1] = -(nums[elem-1]);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,1};
        System.out.print(findDuplicates(arr));
    }
}
