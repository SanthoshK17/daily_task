package pack;

import java.util.Scanner;

class square{
	double a,c;
	double surface_area(double a)
	{
		this.a=a;
		c=4*this.a;
		
		return c;
	}
}

public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square m=new square();
		double d,x;
		
		System.out.println("Enter the value for the side of the square:");
		
		Scanner s=new Scanner(System.in);
		x=s.nextDouble();
		
		
		d=m.surface_area(x);
		
		System.out.println("Volume of the sphere with radius 7.5 is "+d);
		s.close();
	}

}
