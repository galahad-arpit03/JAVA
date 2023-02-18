import java.util.*;

public class exception {
        public static void main(String agrs[]) {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                try {
                        int data = a / b;
                } catch (ArithmeticException e) {
                        System.out.println(e);
                }
                System.out.println("Hellooooooooooooooooooooo");
        }
}