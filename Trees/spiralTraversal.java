//we use two stacks in this program. One to traverse form left to right and the other from right to left
import java.util.Stack;
import java.util.ArrayList;
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class Spiral
{
    ArrayList<Integer> findSpiral(Node root) 
    {
        Stack<Node> stk1 = new Stack<>();
        Stack<Node> stk2 = new Stack<>();
        
        ArrayList<Integer> res = new ArrayList<>();
        
        if(root == null){
            return res;
        }
        stk1.push(root);
        while(!stk1.isEmpty() || !stk2.isEmpty()){
            while(!stk1.isEmpty()){
                Node curNode = stk1.pop();
                res.add(curNode.data);
                if(curNode.right != null){
                    stk2.push(curNode.right);
                }
                if(curNode.left != null){
                    stk2.push(curNode.left);
                }
            }
            while(!stk2.isEmpty()){
                Node curNode = stk2.pop();
                res.add(curNode.data);
                
                if(curNode.left != null){
                    stk1.push(curNode.left);
                }
                if(curNode.right != null){
                    stk1.push(curNode.right);
                }
            }
        }
        return res;
    }
}