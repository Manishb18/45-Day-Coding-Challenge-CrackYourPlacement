import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        
        String s1 = strs[0];
        for(int i = 0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            for(int j = 1; j<strs.length; j++){
                String temp = strs[j];
                if(i >= temp.length() || temp.charAt(i) != ch){
                    return res;
                }
            }
            res += ch+"";
        }
        return res;
    }
}