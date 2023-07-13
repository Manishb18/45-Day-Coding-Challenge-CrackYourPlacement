class Solution {
    public int strStr(String haystack, String needle) {
        int needleLen = needle.length();
        for(int i = 0, j = needleLen-1; j < haystack.length();){
            int k = i;
            int s = 0;
            for(; s<needleLen; s++, k++){
                if(haystack.charAt(k) != needle.charAt(s)){
                    break;
                }
            }
            if(s == needleLen){
                return i;
            }
            else{
                i++;
                j++;
            }
        }  
        return -1; 
    }
}