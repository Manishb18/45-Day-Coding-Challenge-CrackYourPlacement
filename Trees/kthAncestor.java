//We use count of nodes and an array to store the ancestors of the nodes in the tree. Then we use simple for loop to find the kth ancestor
import java.util.Queue;
import java.util.LinkedList;
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}

class Solution
{
    public int kthAncestor(Node root, int k, int node)
    {
        if(root == null || node == root.data){
            return -1;
        }
        //find No.of nodes in the tree
        int cnt = findCnt(root);
        //array to store the ancestors of the nodes
        int ans[] = new int[cnt+1];
        ans[0] = -1;
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        while(!q.isEmpty()){
            Node curNode = q.poll();
            if(curNode == root){
                ans[1] = -1;
            }
            if(curNode.left != null){
                q.add(curNode.left);
                ans[curNode.left.data] = curNode.data;
            }
            if(curNode.right != null){
                q.add(curNode.right);
                ans[curNode.right.data] = curNode.data;
            }
        }
        int curAns = -1;
        for(int i = 0; i<k; i++){
            curAns = ans[node];
            node = curAns;
            if(node == -1){
                return -1;
            }
        }
        return curAns;
    }
    int findCnt(Node root){
        if(root == null){
            return 0;
        }
        
        int left = findCnt(root.left);
        int right = findCnt(root.right);
        
        return 1+left+right;
    }
}