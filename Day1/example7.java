// write a program in  java  to make a simple calculator using switch case and 2 classes 
import  java.util.*;

class arithematicOperators
{
	
	public void Addition ()
	{
		System.out.println(a+b);
	}
	public void Substraction ()
	{
		System.out.println(a-b);
	}
	public void Multiplication()
	{
		System.out.println(a*b);
	}
	public void Division ()
	{
		System.out.println(a/b);
	}
}


class CalcExample
{ 	arithematicOperators A = new arithematicOperators();
	public static void main(String arg[])
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for addition ");
		System.out.println("Enter 2 for substraction ");
		System.out.println("Enter 3 for multiplication ");
		System.out.println("Enter 4 for Divide ");
		
		System.out.println("Enter 1ST NUMBER ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd NUMBER ");
		int b = sc.nextInt();
		System.out.println("Enter Operator Number ");
		int choice = sc.nextInt();

		
		switch(choice){
			case 1: A.Addition(a,b);
				break;
			case 2: A.Substraction(a,b);
				break;
			case 3: A.Multiplication(a*b);
				break;
			case 4: A.Division(a/b);
				break;
			default: System.out.println("Wrong Operator);
		}	

		
	}
}
