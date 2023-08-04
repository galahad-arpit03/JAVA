import java.util.*;

public class method_example {
        static int max(int x, int y) {
                if (x > y) {
                        return x;
                } else {
                        return y;
                }
        }

        public static void main(String[] args) {
                int a = 10;
                int b = 20;
                System.out.println(max(a, b));
        }
}