import java.util.*;

public class OptimalMergePattern {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Number of files :  ");
                int numFiles = scanner.nextInt();

                int[] files = new int[numFiles];
                System.out.println("Enter the size of each file : ");

                for (int i = 0; i < numFiles; i++) {
                        System.out.print("Size of file: " + (i + 1) + ": ");
                        files[i] = scanner.nextInt();
                }

                int totalCost = 0;
                int iter = numFiles - 1;

                while (iter > 0) {
                        Arrays.sort(files);

                        int FileSize = files[0] + files[1];
                        totalCost += FileSize;

                        files[0] = FileSize;
                        files[1] = files[iter];

                        iter--;
                }

                System.out.println("The minimum cost is : " + totalCost);
                scanner.close();
        }
}
