import java.util.Scanner;

public class ExceptionHandlingExample {
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
                        // e.printStackTrace();
                        // System.out.println(e.toString());
                        // System.out.println(e.getMessage());
                        System.out.println(e.toString());


                } catch (Exception e) {

                        System.out.println("Error: " + e.getMessage());
                } finally {

                        scanner.close();
                }
        }
}
