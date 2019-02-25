package pack;
import java.util.*;

class first
{
	int a,b;
	double res;
	void setting_values(int a1,int a2) throws ArithmeticException,NoSuchMethodException,NoSuchFieldException
	{
		a=a1;
		b=a2;
		
		res=(double)a/b;
		
	}
	
	void  show()
	{
		System.out.println("First value: "+a);
		System.out.println("Second value: "+b);
		System.out.println("Resultant value: "+res);
	}
}

public class Throws_demo {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws ArithmeticException, NoSuchMethodException, NoSuchFieldException {
		// TODO Auto-generated method stub
		
		first f= new first();
		Scanner s;
		int f1,f2;
		System.out.println("Enter the first number: ");
		s=new Scanner(System.in);
		f1=s.nextInt();
		System.out.println("Enter the second number: ");
		s=new Scanner(System.in);
		f2=s.nextInt();
		f.setting_values(f1, f2);
		f.show();
		s.close();
	}

}
