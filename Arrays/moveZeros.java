public class moveZeros {
    public static void main(String[] args) {
        int nums[] = {0,0,1};
        moveZeroes(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
    static public void moveZeroes(int[] nums) {
        int n = nums.length;
        for(int i = 0; i<n;){
            if(nums[i] == 0){
                for(int j = i; j<n-1; j++){
                    nums[j] = nums[j+1];
                }
                nums[n-1] = 0;
                n = n-1;
            }
            else{
                i++;
            }
        }
    }
}
