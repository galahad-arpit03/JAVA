
import java.util.Scanner;

public class addNumbers {

        public static void printName(int a, int b) {
                System.out.println(a + b);
                return;
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();

                printName(a, b);
                // System.out.println("Hello World");
        }

}
