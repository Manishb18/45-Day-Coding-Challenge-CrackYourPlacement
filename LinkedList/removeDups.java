class ListNode{
    int val;
    ListNode next;
    ListNode(int data){
        this.val = data;
        this.next = null;
    }
}
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        if(temp == null || temp.next == null){
            return head;
        }
        while(temp.next!= null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }
}