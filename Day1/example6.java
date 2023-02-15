// wap to find greatest of 3 numbers
import  java.util.*;
class example6
{ 
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number ");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd number ");
		int b=sc.nextInt();
		System.out.println("Enter the 3rd number ");
		int c=sc.nextInt();
		  if(a > b)
		{	if (a>c){

            			System.out.println(a + " is greater");
			}
			else{ 
			System.out.println(c + "is greater");
			}	
		}
        		else if(b>c)
		{
            			if (b>a){

            			System.out.println(b+ " is greater");
			}
			else{ 
			System.out.println(a + "is greater");
			}	
		}
		else{
			System.out.println(c + "isgreater");
		}	
		
		
	}
}
