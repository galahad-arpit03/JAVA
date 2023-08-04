import java.util.*;

// import javax.xml.transform.Source;
// WAP take a input of a elements of  ArrayList and print it's elements. 
public class Assisment {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                ArrayList<String> list = new ArrayList<String>();
                // ArrayList l = new ArrayList<String>();

                // System.out.println("Enter the size of Array : ");
                // int size = sc.nextInt();

                // for (int i = 0; i < size + 1; i++)

                while (sc.hasNextLine()) {
                        String input = sc.nextLine();
                        if (input.equalsIgnoreCase("quit")) {
                                break;
                        }
                        list.add(input);
                }

                // list.add("Anurag");
                // list.add("Hi");
                // list.add("hai");
                // list.add("Anurag");
                // System.out.println(list);

                Iterator itr = list.iterator();
                while (itr.hasPrevious()) {
                        System.out.println(itr.hasPrevious());
                }

                // #1
                // Iterator itr = list.iterator();
                // for (int i = 0; i < size + 1; i++) {
                // System.out.println(list.get(i));
                // }
        }

}