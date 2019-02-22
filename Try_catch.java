package pack;
import java.util.*;

public class Try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,d;
		Scanner s;
		
		try 
		{
			System.out.println("Enter the value of A: ");
			s=new Scanner(System.in);
			a=s.nextInt();
			System.out.println("Enter the value of B: ");
			s=new Scanner(System.in);
			b=s.nextInt();
			c=a+b;
			System.out.println("The value of C is : "+c);
			d=c/0;
			System.out.println("The value of D is : "+d);
			
		}
		catch(ArithmeticException ex)
		{
			ex.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("regardless of the program, this statement will be printed.");
		}

	}

}
