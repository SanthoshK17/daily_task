package pack;
import java.util.*;



class marks
{
	enum Grade
	{
		Re_appear,Distinction,First,Second,Third;
	}
	Grade a;
	
	void rank(int a)
	{
		if(a<30)
		{
			System.out.println(Grade.Re_appear);
		}
		if(a<40 && a>30)
		{
			System.out.println(Grade.Third);
		}
		if(a<60 && a>40)
		{
			System.out.println(Grade.Second);
		}
		if(a<75 && a>60)
		{
			System.out.println(Grade.First);
		}
		if(a<100 && a>75)
		{
			System.out.println(Grade.Distinction);
		}
		if(a>100)
		{
			System.out.println("Invalid marks");
		}
	}
}

public class Enumeration {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s;
		int mark;
		 System.out.println("Enter the mark of the student:");
		 s=new Scanner(System.in);
		 mark=s.nextInt();
		 
        marks t1 = new marks(); 
        t1.rank(mark);
	
		

	}

}
