import java.util.*;

public class KnapsackProblem {
        public static int knapsack(int[] weights, int[] values, int c) {
                int n = weights.length;
                int[][] dp = new int[n + 1][c + 1];

                for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= c; j++) {
                                if (weights[i - 1] <= j) {
                                        dp[i][j] = Math.max(values[i - 1] + dp[i - 1][j - weights[i - 1]],
                                                        dp[i - 1][j]);
                                } else {
                                        dp[i][j] = dp[i - 1][j];
                                }
                        }
                }

                return dp[n][c];
        }

        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter number of items : ");
                int n = scanner.nextInt();

                int[] weights = new int[n];
                int[] values = new int[n];

                System.out.println("Enter the weight and value of each item:");

                for (int i = 0; i < n; i++) {
                        System.out.print("Item " + (i + 1) + " weight: ");
                        weights[i] = scanner.nextInt();

                        System.out.print("Item " + (i + 1) + " value: ");
                        values[i] = scanner.nextInt();
                }

                System.out.print("Enter the capacity of the knapsack: ");
                int c = scanner.nextInt();

                int TotalValue = knapsack(weights, values, c);
                System.out.println("The maximum value that can be obtained is: " + TotalValue);
                scanner.close();
        }
}
