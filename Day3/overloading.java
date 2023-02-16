// WAP to illustrate the concept of Method Overloading

import java.util.*;
class overloading {
    public void add(int a, int b)
    {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter 1st Number ");
        // a = sc.nextInt();
        // System.out.println("Enter 2nd Number ");
        // b = sc.nextInt();
        System.out.println("Addition of two numbers is "+ (a+b));
        
    }

    public void add(int a, int b,int c)
    {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter 1st Number ");
        // a = sc.nextInt();
        // System.out.println("Enter 2nd Number ");
        // b = sc.nextInt();
        // System.out.println("Enter 3rd Number ");
        // c= sc.nextInt();
        System.out.println("Addition of two numbers is "+ (a+b+c));
        
    }
    public static void main(String[] args){
        overloading ob1 = new overloading();
        ob1.add(5,6);
        ob1.add(5,6,7);
    }
}