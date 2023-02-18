
import java.util.*;

class Animal1 {
    Animal1() {
        System.out.println("Barking");
    }
}

class Animal2 extends Animal1 {

    Animal2() {
        super();
        System.out.println("Barking");
    }

    void br() {
        // eating();
        System.out.println("No Barking");
        // Animal2();
    }
}

class Super3 {
    public static void main(String args[]) {
        Animal2 sc = new Animal2();
        sc.br();

    }
}
