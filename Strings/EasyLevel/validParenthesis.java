import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i<s.length();  i++){
            char ch = s.charAt(i);

            if(ch == ')' || ch == ']' || ch == '}'){
                if(ch == ')'){
                    if(stack.isEmpty())
                        return false;
                    if(stack.pop() != '('){
                        return false;
                    } 
                }
                else if(ch == ']'){
                   if(stack.isEmpty())
                        return false;
                    if(stack.pop() != '['){
                        return false;
                    } 
                }
                else{
                    if(stack.isEmpty())
                        return false;
                    if(stack.pop() != '{'){
                        return false;
                    } 
                }
            }
            else{
                stack.push(ch);
            }
        }
        if(stack.isEmpty())
        return true;
        return false;
    }
}