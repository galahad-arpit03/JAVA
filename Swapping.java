
import java.util.*;

class SExample {
    Scanner sc = new Scanner(System.in);
    // System.out.println("Enter 1st value ");
    int e1 = sc.nextInt();
    // System.out.println("Enter 2nd value ");
    int e2 = sc.nextInt();

}

public class Swapping {
    public static SExample sc = new SExample();

    static void swap(SExample sc) {
        int temp = sc.e1;
        sc.e1 = sc.e2;
        sc.e2 = temp;
    }

    public static void main(String args[]) {
        swap(sc);
        System.out.println(sc.e1 + " " + sc.e2);
    }
}
