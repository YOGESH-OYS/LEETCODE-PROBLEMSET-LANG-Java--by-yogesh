package Swap_Nodes_in_Pairs;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class Solution {
    ListNode head = null;
    public ListNode swapPairs(ListNode head) {
        // EDGE CASES
        if (head == null){ return null; }
        if (head.next == null){ return head; }

        //MAIN SWAP
        ListNode j = head.next;
        return Swap(head,head,j);
    }

    public ListNode Swap(ListNode head,ListNode i,ListNode j){
        i.next = j.next;
        j.next = i;
        head = j;
        if (i.next == null || i.next.next == null){
            return head;
        }
        head.next.next = Swap(head.next.next,i.next,i.next.next);
        return head;
    }

    public void Display(ListNode head){
        ListNode temp = head;
        while (temp.next != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println(temp.val);
    }

    public void Insert(int data){
        ListNode newnode = new ListNode(data);
        if (head == null){
            head = newnode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null){
            temp = temp.next;
        }temp.next = newnode;
    }
}

