// WAP 

import java.util.*;
 class operator {
    void add(int a, int b){
        // Scanner sc= new Scanner(System.in);
        int sum = a+b;
        System.out.println("Addition of two numbers is "+sum);
    }
    void add(String s1, String s2){
        String concat = s1+s2;
        System.out.println("Concatinated strings is " +concat);
    }
    public static void main(String args[]){
        operator ob = new operator();
        ob.add(7,8);
        ob.add("Anurag","Singh");
    }
}