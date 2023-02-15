import java.util.*;	
class Student
{
	Scanner sc = new Scanner(System.in);
  	String name;
	int roll_no;
 	public void name()
	{
    		System.out.println("Enter Name");
		name = sc.nextLine();
		System.out.println("Enter Roll number");
		roll_no = sc.nextInt();
  	}
}

class Exam extends Student 
{
	 public void display() 
	{	Scanner sc = new Scanner(System.in);

    		System.out.println("Enter Marks of 1st Subject ");
		int n1 = sc.nextInt();
		System.out.println("Enter Marks of 2nd Subject ");
		int n2 =sc.nextInt();
		System.out.println("Enter Marks of 3rd Subject ");
		int n3 = sc.nextInt();
		System.out.println("Enter Marks of 4th Subject ");
		int n4 = sc.nextInt();
		System.out.println("Enter Marks of 5th Subject ");
		int n5 = sc.nextInt();
		System.out.println("Enter Marks of 6th Subject ");
		int n6 = sc.nextInt();
  	}
}

class Result extends Exam	
{
  	public static void main(String[] args) 
		{
			Result res = new Result();
    			res.name();
			res.display();

 		 }
}