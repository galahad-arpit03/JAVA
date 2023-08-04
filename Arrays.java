
import java.util.*;

public class Arrays {
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int num1 = sc.nextInt();
                int[] marks = new int[num1];

                // Input
                for (int i = 0; i < num1; i++) {
                        marks[i] = sc.nextInt();
                }

                int x = sc.nextInt();

                // output
                for (int i = 0; i < marks.length; i++) {
                        if (marks[i] == x) {
                                System.out.println("Number found at : " + i);
                        }
                }
        }

}
