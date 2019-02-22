package pack;

import java.util.*;

public class Nested_try {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try 
		{
			Scanner s;
			String name=new String();
			double avg;
			int m1,m2,m3;
			
			System.out.println("Enter the name of the Student");
			s=new Scanner(System.in);
			name=s.next();
			System.out.println("Enter the marks scored in Paper I by the Student");
			s=new Scanner(System.in);
			m1=s.nextInt();
			System.out.println("Enter the marks scored in Paper II by the Student");
			s=new Scanner(System.in);
			m2=s.nextInt();
			System.out.println("Enter the marks scored in Paper III by the Student");
			s=new Scanner(System.in);
			m3=s.nextInt();
			
			try 
		{
			avg=((m1+m2+m3)/3);
			System.out.println("Name of the student: "+name);
			System.out.println("Marks scored in Paper III by the Student "+m1);
			System.out.println("Marks scored in Paper III by the Student "+m2);
			System.out.println("Marks scored in Paper III by the Student "+m3);
			System.out.println("Average of the student is:" +avg);
			s.close();
		}
			catch(ArithmeticException ex)
			{
				System.out.println("Please enter valid number");
				throw ex;
			}
		}
		catch(Throwable e)
		{
			System.out.println("Please enter valid number");
			e.printStackTrace();
		}
		
		
	}

}
