package pack;

import java.util.*;
public class Chained_Excep {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int a,b;
		double c;
		Scanner s;
		
		System.out.println("Enter the dividend: ");
		s=new Scanner(System.in);
		a=s.nextInt();	
		System.out.println("Enter the divisor: ");
		s=new Scanner(System.in);
		b=s.nextInt();	
		c=a/b;
		System.out.println("The resultant is "+c);
		s.close();
	
	}
	catch(ArithmeticException e)
	{
		System.out.println("Inside the Arithmetic Exeption block");
		e.printStackTrace();
		System.out.println(e.getCause());
		throw e;
	}
	
	}
		

}
