import java.util.*;
import pack.A;
public class B{
		public static void main(String arg[])
{
			int a,b;
			A o = new A();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1st number");
			 a = sc.nextInt();
			System.out.println("Enter 2nd number");
			 b = sc.nextInt();
			System.out.println("Greatest is  " +o.getdata(a,b));
}
}	