package Swap_Nodes_in_Pairs;

public class Main {
    public static void main(String[] args) {
        Solution newList = new Solution();
        newList.Insert(10);
        newList.Insert(20);


        newList.head = newList.swapPairs(newList.head);
        newList.Display(newList.head);
    }
}
