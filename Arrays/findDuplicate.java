import java.util.*;
class Solution {
    public static void main(String[] args) {
        int nums[] = {1,2,3,3,4};
        System.out.print(findDuplicate(nums));
    }
    static int findDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i : nums){
            if(hs.contains(i)){
                return i;
            }
            else{
                hs.add(i);
            }
        }
        return 0;
    }
}