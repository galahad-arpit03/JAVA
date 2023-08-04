import java.util.*;

// import javax.xml.transform.Source;
// WAP take a input of a elements of  ArrayList and print it's elements. 
class arrayListInt {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                ArrayList<Integer> list = new ArrayList<Integer>();
                // ArrayList l = new ArrayList<String>(); #2,3

                // System.out.println("Enter the size of Array : ");
                // int size = sc.nextInt();

                while (sc.hasNextInt()) {
                        list.add(sc.nextInt());
                }

                list.forEach((g) -> {
                        System.out.println(g * 10);
                });

                // Iterator itr = list.iterator();
                // while (itr.hasNext()) {
                // System.out.println(itr.next());
                // }
        }
        // for (int i = 0; i < size; i++) { #3
        // System.out.println(list.get(i));
        // }

        // #3
        // for (int i = 0; i < size; i++) {
        // list.add(sc.nextInt());
        // }

        // #1
        // list.add("Anurag");
        // list.add("Hi");
        // list.add("hai");
        // list.add("Anurag");
        // System.out.println(list);

        // Iterator itr = list.iterator();
        // while (itr.hasNext()) {
        // System.out.println(itr.next());
        // }

        // Iterator itr = list.iterator();

        // #2
        // for (int i = 0; i < size; i++) {
        // list.add(i, sc.nextInt());
        // }
}
