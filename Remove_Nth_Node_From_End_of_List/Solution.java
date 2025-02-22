package Remove_Nth_Node_From_End_of_List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }

    ListNode(){}
}
public class Solution {
    ListNode head = null;

    public void Insert(int data){
        ListNode newnode = new ListNode(data);
        if(head == null){
            head = newnode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null){
            temp = temp.next;
        }temp.next = newnode;
    }

    public static void Display(ListNode Pass){
        while (Pass.next != null){
            System.out.println(Pass.val);
            Pass = Pass.next;
        }
        System.out.println(Pass.val);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || (head.next == null && n == 1)) { return null; }
        int len = 1;ListNode temp1 = head;
        // finding length
        while (temp1.next != null){
            len++;
            temp1 = temp1.next;
        }

        if (n == 1){
            ListNode temp2 = head;
            while (temp2.next.next != null){
                temp2 = temp2.next;
            }
            temp2.next = null;
            return head;
        }
        if (n == len){ return head.next; }

        int newLen = len-n;
        int newCount = 1;
        ListNode temp3 = head;
        while (newCount != newLen){
            temp3 = temp3.next;
            newCount++;
        }temp3.next = temp3.next.next;
        return head;
    }
}
