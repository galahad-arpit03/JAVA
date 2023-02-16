import java.util.*;

interface Temp1{
    default void draw()
    {
        System.out.println("Hello Duniya");
        draw1();
    }
    private void draw1(){
        System.out.println("Hello World");
    }
}
class example implements Temp1{
    public static void main(String args[]){

        Temp1 ob1 = new example();
        ob1.draw();
    }
}