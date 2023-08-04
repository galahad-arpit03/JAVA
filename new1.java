class Stu {
        int roll_no;
        String name;
        static String college = "SISTec";

        void get_data(int a, String b) {
                roll_no = a;
                name = b;
        }

        void display() {
                System.out.println(roll_no + " " + name + " " + college);
        }
}

class new1 {

        public static void main(String args[]) {
                // New sc = new New();

                Stu s2 = new Stu();
                Stu s1 = new Stu();
                s1.get_data(00, "Anurag");
                s2.get_data(00, "Anurag");
                s1.display();
                s2.display();

                // System.out.println("This is statement 1");
        }
}
