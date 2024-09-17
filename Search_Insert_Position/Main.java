package Search_Insert_Position;

public class Main {
    public static void main(String[] args) {
        int[] a= {1,3,5,6};
        int tar = 7;
        Solution l = new Solution();
        System.out.println(l.searchInsert(a,tar));
    }
}
