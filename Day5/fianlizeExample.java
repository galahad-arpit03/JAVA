import java.util.*;

public class fianlizeExample {
        public static void main(String args[]) {
                fianlizeExample sc = new fianlizeExample();
                System.out.println("Objet id is : " + sc);
                sc = null;
                System.gc();
                System.out.println("garbage collector Envoked");
        }

        protected void Finalize() {
                System.out.println("finalize generated");
        }

}
