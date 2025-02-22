package Remove_Nth_Node_From_End_of_List;
import static Remove_Nth_Node_From_End_of_List.Solution.*;

public class Main {
    public static void main(String[] args) {
        Solution List = new Solution();
        List.Insert(10);
        List.Insert(20);
        List.Insert(30);
        List.Insert(40);
        List.head = List.removeNthFromEnd(List.head,2);
        Display(List.head);
    }
}
