package pack;
import java.util.*;

public class nested_class {
	
	int a,b;
	Scanner x;
	
	void begin() 
	{
		inner i=new inner();
		i.getter();
	}
	
	void setter() {
		System.out.println("Enter first value: ");
		x=new Scanner(System.in);
		a=x.nextInt();
		System.out.println("Enter second value: ");
		x=new Scanner(System.in);
		b=x.nextInt();
	}
	
	class inner
	{
		void getter() {
			setter();
			System.out.println("Inner class method");
			System.out.println("Outer class variable 'a' is "+a);
			System.out.println("Outer class variable 'b' is "+b);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nested_class q=new nested_class();
		q.begin();
		
		
	}

}
