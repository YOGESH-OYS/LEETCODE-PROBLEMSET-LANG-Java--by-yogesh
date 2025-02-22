package Merge_Two_Sorted_Lists;

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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //Edge cases
        if (list1 == null && list2 == null){ return null; }
        if (list1 == null){ return list2; }if (list2 == null){ return list1; }

        //Main pass
        if (list1.val <= list2.val){
            return Reverter(list1,list2);
        }else {
            return Reverter(list2,list1);
        }
    }
    public ListNode Reverter(ListNode i,ListNode j){
        if (i.next == null){ i.next = j; return i;}
        if (j.val <= i.next.val){
            ListNode temp = j.next;
            j.next = i.next;
            i.next = j;
            if (temp == null){
                return i;
            }
            j = temp;
        }
        i.next =  Reverter(i.next,j);
        return i;
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
    public void Display(ListNode head){
        ListNode temp = head;
        while (temp.next != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println(temp.val);
    }
}
