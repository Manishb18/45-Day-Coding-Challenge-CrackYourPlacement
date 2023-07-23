class ListNode{
    int val;
    ListNode next;
    ListNode(int data){
        this.val = data;
        this.next = null;
    }
}
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}