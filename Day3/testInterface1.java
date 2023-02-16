import java.util.*;

interface ShapeX {
    public String base = "This is shape 1";

    public void display1();
}

interface ShapeY extends ShapeX {
    public String baseX = "This is shape 2";

    public void display2();
}

class ShapeG implements ShapeY
	{
	public String baseYString ="This is shape 3";
    	 public void display1()
	{
		System.out.println("Circle " +baseY);
	}
	System.out.println("Circle " +baseX);

}

public class TestInterface1 {
    public static void main(String[] args) {
        ShapeG circle = new ShapeG();
        circle.display2();
        circle.display1();
    }
}