package pack;
import java.util.Scanner;

class student
{
	static String rno;
	student()
	{
		year="ABC19-";
	}
	Scanner s;
	
	String name=new String();
	String year;
	int m1,m2,m3;

	void setter(String opt)
	{
		System.out.println("Enter the name of the student:");
		s=new Scanner(System.in);
		name=s.next();
		System.out.println("Enter the registration number of the student:");
		s=new Scanner(System.in);
		rno=s.next();
		rno=year+rno;
	}
 void setMarks()
	{
		System.out.println("Enter the mark scored by the student in paper I:");
		s=new Scanner(System.in);
		m1=s.nextInt();
		System.out.println("Enter the mark scored by the student in paper II:");
		s=new Scanner(System.in);
		m2=s.nextInt();
		System.out.println("Enter the mark scored by the student in paper III:");
		s=new Scanner(System.in);
		m3=s.nextInt();
	}
 void show_student()
 {
	 System.out.println("Name of the student is: "+name);
		System.out.println("The registration number of the student is :"+rno);
		System.out.println("The mark scored by the student in paper I : " +m1 );
		System.out.println("the mark scored by the student in paper II : "+m2);
		System.out.println("the mark scored by the student in paper III : "+m3);
 }
	
}

class passed_out extends student
{
	String result=new String();
	String work=new String();
	passed_out()
	{
		super();
	}  
	void setter(String opt)
	{	
		if(opt.contentEquals("Old"))
	{
		int year;
		System.out.println("Enter the passed out year: ");
		s=new Scanner(System.in);
		year=s.nextInt();
		System.out.println("Enter the name of the student:");
		s=new Scanner(System.in);
		name=s.next();
		System.out.println("Enter the registration number of the student:");
		s=new Scanner(System.in);
		rno="ABC"+year+"-"+s.next();
		
	}
	else {
		super.setter("New");
	}
	}
	void set_Work()
	{
		System.out.println("Enter the result status of the student "+rno+" :" );
		s=new Scanner(System.in);
		result=s.next();
		System.out.println("Enter the occupation of the student "+rno+" :");
		s=new Scanner(System.in);
		work=s.next();
	}

	void show()
	{
		System.out.println("Name of the student is: "+name);
		System.out.println("The registration number of the student is :"+rno);
		System.out.println("The result status of the student is : " +result );
		System.out.println("The student now working at : "+work);
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String opt;
		Scanner q;
		System.out.println("Is the student currently in this college (Yes/No) ?");
		q=new Scanner(System.in);
		opt=q.next();
		if(opt.contentEquals("Yes"))
		{
			student s1=new student();
			student p1=new passed_out();
			p1.setter("New");
			s1.setMarks();
			s1.show_student();
		}
		else if (opt.contentEquals("No"))
		{
			passed_out p=new passed_out();
			student p1=new passed_out();
			p1.setter("Old");
			p.set_Work();
			p.show();
		}
		else
		{
			System.out.println("Invalid choice");
		}
		q.close();

	}

}
