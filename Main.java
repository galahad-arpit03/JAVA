import java.util.*;	
class A
{
  	String name;
 	public void name()
	{
    		System.out.println("Ashutosh");
  	}
}

class B extends A 
{

	  public void display() 
	{
    		System.out.println("My name is " + name);
  	}
}

class Main 	
{
  	public static void main(String[] args) 
		{
			B name1 = new B();
    			name1.name = "Chirag";
    			name1.display();
   			name1.name();

 		 }
}