import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class SLL{
    Node head = null;

    void addToLL(int a){
        Node curNode = new Node(a);
        if(head == null){
            head = curNode;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = curNode;
            System.out.println("Added successfully!");
        }
    }

    void printLL(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }
    void reverseList(){
        Node cur = head;
        Node prev = null;
        Node next = null;
        while(cur.next!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        cur.next = prev;
        head = cur;
    }

}
class reverseLL{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        SLL l1 = new SLL();
        for(int i : arr){
            l1.addToLL(i);
        }
        l1.reverseList();
        l1.printLL();
    }
}