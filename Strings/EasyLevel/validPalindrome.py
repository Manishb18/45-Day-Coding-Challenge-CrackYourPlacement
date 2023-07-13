class Solution:
    def validPalindrome(self, s: str) -> bool:
        i = 0
        j = len(s)-1
        while(i <= j):
            if s[i] != s[j]:
                if(self.isPalindrome(s[:i] + s[i+1:])):
                    return True
                elif(self.isPalindrome(s[:j] + s[j+1:])):
                    return True
                else:
                    return False
            i+=1
            j-=1 
        return True

    def isPalindrome(self,s):
        return s == s[::-1]