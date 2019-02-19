package pack;

import java.util.Scanner;

class block{
	public int m1,m2,m3;
	private double rno;
	protected String name;
	Scanner b;
	void getMarks()
	{
		System.out.println("Enter the mark scored in subject 1:");
		b= new Scanner(System.in);
		m1=b.nextInt();
		System.out.println("Enter the mark scored in subject 2:");
		b= new Scanner(System.in);
		m2=b.nextInt();
		System.out.println("Enter the mark scored in subject 3:");
		b= new Scanner(System.in);
		m3=b.nextInt();
		
	}
	
	void getDetails() {
		System.out.println("Enter the Registration number of the student:");
		b= new Scanner(System.in);
		rno=b.nextDouble();
		
	}

	void disp() {
		double avg;
		int tot;
		tot=m1+m2+m3;
		avg=(double)tot/3;
		System.out.println("Name of the student: "+name);
		System.out.println("Registration number of the student: "+rno);
		System.out.println("Marks scored in subject 1:" +m1);
		System.out.println("Marks scored in subject 2:" +m2);
		System.out.println("Marks scored in subject 3:" +m3);
		System.out.println("Total marks scored in all subject:" +tot);
		System.out.println("Average marks scored by the student:" +avg);
	}
}

class teacher extends block{
	void getName()
	{
		System.out.println("Enter the name of the student:");
		b= new Scanner(System.in);
		name=b.next();
		
	}
}

public class access_control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		block obj=new block();
		teacher obj1= new teacher();
		
		
		obj.getDetails();
		obj1.getName();
		obj.getMarks();
		obj.disp();
		
		System.out.println("Enter the marks of subject 1:");
	}

}
