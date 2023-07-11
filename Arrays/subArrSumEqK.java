class Solution {
    public int subarraySum(int[] nums, int k){
        HashMap<Integer, Integer> hm = new HashMap<>();

        hm.put(0,1);
        int sum = 0;
        int cnt = 0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            int diff = sum - k;
            if(hm.containsKey(diff)){
                cnt+=hm.get(diff);
            }
            hm.put(sum, hm.getOrDefault(sum, 0)+1);
        } 
        return cnt;
    }
}
