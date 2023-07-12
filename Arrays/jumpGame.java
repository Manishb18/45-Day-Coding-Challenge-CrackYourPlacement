class Solution {
    public boolean canJump(int[] nums) {
        int stepsReq = 1;
        int goalInd = nums.length-1;

        if(nums.length == 1)
            return true;
        for(int i = nums.length-2; i >=0;i--){
            if(nums[i] < stepsReq){
                stepsReq++;
            }
            else{
                stepsReq = 1;
                goalInd = i;
            }
        }
        if(goalInd != 0){
            return false;
        }
        else{
            return true;
        }

    }
}