import java.util.*;

class Student  {
        int rollno;
        String name;
        int age;

        void Student(int rollno, String name, int age) {
                this.rollno = rollno;
                this.name = name;
                this.age = age;
        }
}
class Compareing{
        public int compereTo(Student st) {
                if (rollno == this.rollno)
                        return 0;
                else if (rollno > this.rollno)
                        return 1;
                else
                        return 1;

        }
}

public class compareTOEx {

        public static void main() {
                ArrayList<Student> st = new ArrayList<Student>();
                st.add(new Student(88, "Anamika", 2));
                st.add(new Student(88, "Prachi", 10));
                st.add(new Student(88, "Mahak", 19));
                Collections.sort(st);
                for (Student an : st) {
                        System.out.println(an.rollno + " " + an.name + " " + an.age);

                }

        }
}