import java.util.*;

public class palindromePattern {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int row = sc.nextInt();
                // int column = sc.nextInt();
                for (int i = 1; i <= row; i++) {
                        for (int j = 1; j <= row - i; j++) {
                                System.out.print(" ");
                        }

                        for (int j = i; j >= 1; j--) {
                                System.out.print(j);
                        }

                        for (int j = 2; j <= i; j++) {
                                System.out.print(j);
                        }
                        System.out.println();
                }

        }
}
