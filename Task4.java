class counter {
        static int count;
        int number;

        void C() {
                number = ++count;
        }

        void getCount() {
                System.out.print("I am object " + number);
        }
}

public class Task4 {
        public static void main(String args[]) {
                counter c = new counter();
                counter c1 = new counter();
                counter c2 = new counter();
                c.getCount();
                c1.getCount();
                c2.getCount();
        }

        // System.out.println("Count is " + c.count); }
}
