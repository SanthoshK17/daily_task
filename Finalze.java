package pack;

import java.util.Scanner;

public class Finalze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s;
		try {
			
		double rno,avg;
		int m1,m2,m3;
		System.out.println("Enter the registration number: ");
		
		s=new Scanner(System.in);
		rno=s.nextDouble();
		
		System.out.println("Enter mark 1: ");
		s=new Scanner(System.in);
		m1=s.nextInt();
		
		System.out.println("Enter mark 2: ");
		s=new Scanner(System.in);
		m2=s.nextInt();
		
		System.out.println("Enter mark 3: ");
		s=new Scanner(System.in);
		m3=s.nextInt();
		
		System.out.println("The registration number is: " +rno);
		avg=(m1+m2+m3)/3;
		System.out.println("The average of the student is "+avg);
		
		
		}
		catch(Throwable ex)
		{
			 ex.printStackTrace();
		}
		finally {
			System.out.println("Program exit");
		}
	}

}
