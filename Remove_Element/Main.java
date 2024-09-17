package Remove_Element;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,0,0,0,4,4,4};
        int val = 4;
        Solution l = new Solution();
        System.out.println(l.removeElement(a,val));
    }
}
