package pack;

final class Methods{  // using final class - the class cannot be inherited.
	public void dis()
	{
		System.out.println("No parameters were passed");
	}
	public void dis(int i)
	{
		System.out.println("One integer parameter was passed :"+ i);
	}
	public void dis(int i,int j)
	{
		System.out.println("Two integer parameters were passed :"+i+" and "+j);
	}
	public void dis(double a)
	{
		System.out.println("One double parameter was passed :"+ a);
	}
	public void dis(double a,double b)
	{
		System.out.println("Two double parameter were passed :"+a+" and "+b);
	}
	public void dis(int i,double b)
	{
		System.out.println("One integer and one double parameter were passed :"+i+" and "+b);
	}
	public void dis(double a,int i)
	{
		System.out.println("One double and one parameter was passed :"+a+" and "+i);
	}
}

public class method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Methods obj=new Methods();
		obj.dis();
		obj.dis(8);
		obj.dis(8,7);
		obj.dis(7.5);
		obj.dis(7.5,12.5);
		obj.dis(7,5.5);
		obj.dis(7.3,5);
		}

}
