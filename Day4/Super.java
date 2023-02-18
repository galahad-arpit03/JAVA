import java.util.*;

class mew {
    String c = "String 1";
}

class meww extends mew {
    String c = "String 2";

    void printString() {
        System.out.println(c);
        System.out.println(super.c);
    }
}

class Super {
    public static void main(String args[]) {
        meww sc = new meww();
        sc.printString();

    }
}