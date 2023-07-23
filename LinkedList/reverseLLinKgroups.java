class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Solution
{
    public static Node reverse(Node node, int k)
    {
        if(node == null){
            return null;
        }
        
        Node cur = node;
        Node prev = null;
        Node next = null;
        
        int curCnt = 0;
        
        while(curCnt < k && cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            curCnt++;
        }
        node.next = reverse(next, k);
        
        return prev;
    }
}
