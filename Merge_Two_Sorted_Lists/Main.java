package Merge_Two_Sorted_Lists;

public class Main {
    public static void main(String[] args) {
        Solution newList = new Solution();
        newList.Insert(20);
        newList.Insert(30);
        newList.Insert(50);

        Solution newList1 = new Solution();
        newList1.Insert(10);
        newList1.Insert(40);
        newList1.Insert(60);

        newList.Display(newList.head);
        System.out.println();
        newList1.Display(newList1.head);

        System.out.println();
        Solution result = new Solution();
        result.head = result.mergeTwoLists(newList.head,newList1.head);
        result.Display(result.head);
    }
}
