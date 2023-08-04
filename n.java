import java.io.IOException;
import java.util.Scanner;

public class n {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                try {
                        System.out.print("Enter the first number: ");
                        int num1 = scanner.nextInt();
                        System.out.print("Enter the second number: ");
                        int num2 = scanner.nextInt();
                        int result = num1 / num2;
                        System.out.println("Result: " + result);
                } catch (ArithmeticException e) {

                        System.out.println(e.toString());

                } catch (Exception e) {

                        System.out.println("Error: " + e.getMessage());
                } finally {
                        System.out.println("Thank u");
                        // scanner.close();
                }
                // throw new IOException("Wrong Input" + .getMessage());
        }
}
