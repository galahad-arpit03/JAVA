import java.util.*;

interface polygon{
    void getArea(int len, int br);
}
class ractangle implements polygon{
    public void getArea(int len, int br){
    System.out.println("Area is " +(len*br));
    }
}
class abstract_type{
    public static void main(String agrs[]){
        ractangle r1 = new rectangle();
        r1.getArea(3,5);
    }
}