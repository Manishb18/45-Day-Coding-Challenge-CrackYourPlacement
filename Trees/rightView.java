//We can also do it using simple level order traversal using queue. We have to get the last element of every level
//but we have used recursion here
import java.util.ArrayList;
class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}

class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node){
        int curLevel = 0;
        ArrayList<Integer> res = new ArrayList<>();
        findRightView(node, res, curLevel);
        return res;
    }
    void findRightView(Node node, ArrayList<Integer> arr,int curLevel){
        if(node == null){
            return;
        }
        if(arr.size() <= curLevel){
            arr.add(node.data);
            findRightView(node.right, arr, curLevel+1);
        }
        findRightView(node.right, arr, curLevel+1);
        findRightView(node.left, arr, curLevel+1);
    }
}


