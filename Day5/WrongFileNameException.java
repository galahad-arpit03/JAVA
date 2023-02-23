
// import java.net.SocketTimeoutException;
import java.util.*;

class InvalidAgeException extends Exception {
        public InvalidAgeException(String Error) {
                super(Error);
        }
}

public class WrongFileNameException {

        static void Validate(int age) throws InvalidAgeException {

                if (age <= 18) {
                        throw new InvalidAgeException("age is below 18, you can't vote");
                } else {
                        System.out.println("congrats you are BALIK, You can vote");
                }
        }

        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your Age : ");
                int age = sc.nextInt();
                // InvalidAgeException obj = new InvalidAgeException();
                try {
                        Validate(age);
                } catch (InvalidAgeException e) {
                        System.out.println("Error Occoured");
                }

                System.out.println("Code Ends");

        }

}
