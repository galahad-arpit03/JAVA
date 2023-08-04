import java.util.*;

interface ShapeX
{
	public String base ="This is shape 1";
    	 public void display1();
}
interface ShapeY extends ShapeX	
	{
	public String base ="This is shape 2";
    	 public void display2();
}
class ShapeG implements ShapeY
	{
	public String base ="This is shape 3";
    	 public void display2()
	{
		System.out.println("Circle " + ShapeY.base);
	}
	 public void display1()
	{
		System.out.println("Circle " + ShapeX.base);
	}
}	

public class testInterface
	{	
	public static void main(String[]args)
	{
	ShapeG circle = new ShapeG();
	circle.display2();
	circle.display1();
	}
}