import java.util.*;

public class QuickSortExample {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the number of elements: ");
                int n = scanner.nextInt();
                int[] arr = new int[n];
                System.out.println("Enter the elements:");
                for (int i = 0; i < n; i++) {
                        arr[i] = scanner.nextInt();
                }

                Arrays.sort(arr);
                System.out.println("The sorted array is: " + Arrays.toString(arr));
                scanner.close();
        }
}
