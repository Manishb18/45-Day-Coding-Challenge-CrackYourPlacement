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
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        Node zeroLLHead = null;
        Node oneLLHead = null;
        Node twoLLHead = null;
        
        while(head!=null){
            Node newNode = new Node(head.data);
            if(head.data == 0){
                if(zeroLLHead == null){
                    zeroLLHead = newNode;
                }
                else{
                    newNode.next = zeroLLHead;
                    zeroLLHead = newNode;
                }
            }
            else if(head.data == 2){
                if(twoLLHead == null){
                    twoLLHead = newNode;
                }
                else{
                    newNode.next = twoLLHead;
                    twoLLHead = newNode;
                }
            }
            else{
                if(oneLLHead == null){
                    oneLLHead = newNode;
                }
                else{
                    newNode.next = oneLLHead;
                    oneLLHead = newNode;
                }
            }
            head = head.next;
        }
        Node res = null;
        if(zeroLLHead != null){
            res = zeroLLHead;
            while(zeroLLHead.next!=null){
               zeroLLHead = zeroLLHead.next;
            }
            if(oneLLHead != null){
                zeroLLHead.next = oneLLHead;
                zeroLLHead = oneLLHead;
                while(zeroLLHead.next!=null){
                    zeroLLHead = zeroLLHead.next;
                }
                zeroLLHead.next = twoLLHead;
            }
            else{
                zeroLLHead.next = twoLLHead;
            }
            
        }
        else if (oneLLHead != null){
            res = oneLLHead;
            if(twoLLHead == null){
                return res;
            }
            while(oneLLHead.next!=null){
                oneLLHead = oneLLHead.next;
            }
            oneLLHead.next = twoLLHead;
            
        }
        else{
            res = twoLLHead;
        }
        return res;
    }
}