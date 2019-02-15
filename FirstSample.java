package pack;
import java.util.Scanner;
public class FirstSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opt,x=0,y=0;
		System.out.println("Enter option: 1.Add 2.Subtract 3.Divide 4.Generate a fibonacci series");
		Scanner a= new Scanner(System.in);
		opt=a.nextInt();
		
		if(opt<4)
		{
		System.out.println("Enter 1st value:");
		Scanner b= new Scanner(System.in);
		x=b.nextInt();
		System.out.println("Enter 2st value:");
		Scanner c= new Scanner(System.in);
		y=c.nextInt();
		if(opt==1)           		// using if statement
		{	
			int h=x+y;
			System.out.println("Upon adding the two numbers, the result is :"+h);
		}
		if(opt==2)					//using block of code
		{	int i=x-y;
			System.out.println("Upon subtracting the two numbers, the result is :"+i);
		}
		if(opt==3)
		{ 	
			double j=(double)x/y;  	//type casting 
			System.out.println("Upon dividing the two numbers, the result is :"+j);
		}
		b.close();
		c.close();
		}
		if(opt==4)
		{
			System.out.println("Enter the number of elements to be present in the fibonacci series");
			Scanner d= new Scanner(System.in);
			int k=d.nextInt();
			int f1=0,f2=1,t=0;
			System.out.println(f1);	//printing the first two elements
			System.out.println(f2);			
			for(int loop=0;loop<k-2;loop++)
			{
				t=f1+f2;
				System.out.println(t);
				f1=f2;
				f2=t;
			}
			d.close();
		}
		a.close();	
			}

}
