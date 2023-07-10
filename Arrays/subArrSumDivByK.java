import java.util.HashMap;

public class subArrSumDivByK {
    public int subarraysDivByK(int[] nums, int k){
        HashMap<Integer, Integer> hm = new HashMap<>();

        int cnt = 0;
        int sum = 0;
        int rem = 0;

        hm.put(0,1);

        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            rem = sum % k;

            if(rem < 0){
                rem += k;
            }

            if(hm.containsKey(rem)){
                cnt += hm.get(rem);
                hm.put(rem, hm.get(rem)+1);
            }
            else{
                hm.put(rem, 1);
            }
        }
        return cnt;
    }
}
