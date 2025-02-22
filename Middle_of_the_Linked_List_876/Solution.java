package Middle_of_the_Linked_List_876;

class Solution {

    public static class ListNode {
          int val;
          ListNode next;
          ListNode(int val) { this.val = val; this.next = null; }
    }

    ListNode head;

    public void Insert(int data){
        ListNode j = new ListNode(data);
        if (this.head == null){
            this.head = j;
            return;
        }
        ListNode temp = this.head;
        while (temp.next != null){
            temp = temp.next;
        }temp.next = j;
    }

    public void Display(){
        ListNode temp = this.head;
        while (temp.next != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println(temp.val);
    }

    public void D(){
        ListNode temp = head;
        System.out.println(temp.next == null);
    }

    public ListNode middleNode(ListNode head) {
        ListNode F = head;
        ListNode S = head;
        while (F.next != null && F.next.next != null){
            F = F.next.next;
            S = S.next;
        }
        if (F.next != null){
            S = S.next;
        }
        return S;
    }
}