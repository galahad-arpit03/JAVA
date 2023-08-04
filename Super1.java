
import java.util.*;

class Animal1 {
    void eating() {
        System.out.println("Barking");
    }
}

class Animal2 extends Animal1 {

    void eating() {
        System.out.println("Why Barking?");
    }

    void br() {
        System.out.println("No Barking");
    }

    void br1() {
        super.eating();
        br();
    }
}

class Super1 {
    public static void main(String args[]) {
        Animal2 sc = new Animal2();
        sc.br1();

    }
}
