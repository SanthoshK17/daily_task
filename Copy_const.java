package pack;
import java.util.*;

public class Copy_const {

	int a,b;
	Scanner x;
	Copy_const q;
	Copy_const()
	{
		System.out.println("Enter first value: ");
		x=new Scanner(System.in);
		a=x.nextInt();
		System.out.println("Enter second value: ");
		x=new Scanner(System.in);
		b=x.nextInt();
		
		System.out.println("First value: "+a);
		System.out.println("Second value: "+b);
	}
	Copy_const(Copy_const q) 
	{ 	
		System.out.println("Constructor call");
		System.out.println("Enter first value: ");
		x=new Scanner(System.in);
		a=x.nextInt();
		System.out.println("Enter second value: ");
		x=new Scanner(System.in);
		b=x.nextInt();
		
		System.out.println("First value: "+a);
		System.out.println("Second value: "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Copy_const q= new Copy_const();
		@SuppressWarnings("unused")
		Copy_const q2= new Copy_const(q);
	}

}
