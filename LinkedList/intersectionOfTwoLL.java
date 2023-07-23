import java.util.HashSet;
class ListNode{
    int val;
    ListNode next;
    ListNode(int data){
        this.val = data;
        this.next = null;
    }
}
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hs = new HashSet<>();

        while(headA!= null){
            hs.add(headA);
            headA = headA.next;
        }
        while(headB!=null){
            if(hs.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}