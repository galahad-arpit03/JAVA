import java.util.*;

interface Drawable{
    void Draw();
    static int add(int a, int b){
       return a+b;
    }
}

class interface1 implements Drawable{
    public void Draw(){
        System.out.println("Hello World");
    }
}

class ss{
    public static void main(String agrs[])
    {
        Drawable ob1 = new interface1();
        ob1.Draw();
        System.out.println(Drawable.add(5,6));
     }
}