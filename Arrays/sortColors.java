class Solution{
    public static void main(String[] args) {
        int a[] = {1,2,0, 1, 2, 0};
        sortColors(a);
        for(int i : a){
            System.out.print(i+" ");
        }
    }
    static void sortColors(int[] nums) {
        int n = nums.length;

        for(int i = 0; i<n; ){
            if(nums[i] == 0){
                for(int j = i, k = i-1; j>0 && k>=0; j--, k--){
                    nums[j] = nums[k];
                }
                nums[0] = 0;
                i++;
            }
            else if(nums[i] == 2){
                for(int j = i, k = i+1; j<n-1 && k<=n-1; j++, k++){
                    nums[j] = nums[k];
                }
                nums[n-1] = 2;
                n = n-1;
            }
            else{
                i++;
            }
        }
    }
}
