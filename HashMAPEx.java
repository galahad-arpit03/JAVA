import java.util.*;

public class HashMAPEx {

        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                HashMap<Integer, String> hmap = new HashMap<Integer, String>();
                // ArrayList l = new ArrayList<String>(); #2,3

                // System.out.println("Enter the size of Array : ");
                // int size = sc.nextInt();

                hmap.put(123, "Anna");

                hmap.put(12, "Annajaa");

                hmap.put(1233, "Annaaha");

                hmap.put(12222, "Annahahahaha");

                Set set = hmap.entrySet();
                Iterator iterator = set.iterator();

                while (iterator.hasNext()) {
                        Map.Entry n = (Map.Entry) iterator.next();
                        System.out.println("key is  " + n.getKey() + "  & value is " + n.getValue());
                }

                hmap.forEach((key, value) -> System.out.println(key + " => " + value));


                // for (hmap.Entry m : m.entrySet()) {
                // System.out.println(m.getkey()+" " +m.getValue());
                // }

                // while (sc.hasNextInt()) {
                // hmap.put(sc.nextInt());
                // }

                // hmap.forEach((g) -> {
                // System.out.println(g * 10);
                // });

                // Iterator itr = list.iterator();
                // while (itr.hasNext()) {
                // System.out.println(itr.next());
                // }
        }
}
