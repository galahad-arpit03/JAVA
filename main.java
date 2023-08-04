import java.util.*;

interface Drawable{
    void Draw();
    default void msg(){
        System.out.println("Hello Indians");
    }
}

class interface1 implements Drawable{
    public void Draw(){
        System.out.println("Hello World");
    }
}

class main{
    public static void main(String agrs[])
    {
        Drawable ob1 = new interface1();
        ob1.Draw();
        ob1.msg();
    }
}