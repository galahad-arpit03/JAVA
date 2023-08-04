import java.util.*;

public class invertedRightTriangle {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                // int column = sc.nextInt();

                for (int i = n; i >= 0; i--) {
                        for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                        }
                        System.out.println("");
                }

        }
}
