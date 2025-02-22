package Middle_of_the_Linked_List_876;

public class Main {
    public static void main(String[] args) {
        Solution o = new Solution();
        o.Insert(1);//temp.val
        o.Insert(2);//temp.next.val
        o.Insert(3);//temp.next.next.val
        o.Insert(4);
        o.Insert(5);
        o.Insert(6);
        o.Display();
        o.D();
        o.head = o.middleNode(o.head);
        o.Display();
    }
}
