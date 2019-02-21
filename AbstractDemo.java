package pack;
import java.util.*;

abstract class solo
{
	Scanner s;
	int a,b;
	solo()
	{
		System.out.println("Inside constructor of abstract class");
	}
	static 
	{
		System.out.println("Inside the static block in abstract class");
	}
	abstract void idea();
	final void set_Swap()
	{
		System.out.println("Swapping the data");
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("A="+a);
		System.out.println("B="+b);
	}
}
class diy extends solo
{

	@Override
	void idea() {
		// TODO Auto-generated method stub
		System.out.println("Method in abstract class");
		
		System.out.println("Enter the first value: ");
		s=new Scanner(System.in);
		a=s.nextInt();
		System.out.println("Enter the second value: ");
		s=new Scanner(System.in);
		b=s.nextInt();
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solo k=new diy();
		k.idea();
		k.set_Swap();
	}

}
