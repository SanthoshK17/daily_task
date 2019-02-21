/**
 * 
 */
package pack;
import java.util.*;
/**
 * @author santhoshkumar.sundar
 *
 */
interface Implementing_interface {
	
	final String dept_name="Java development";
	static int dept_no=122;
	static int proj_no=135;
	void in();
	void out();
public interface nested_Interface
{
	void change_Deptno();
	
}
}
interface Child extends Implementing_interface
{
	void access();
}

abstract class Hi implements Implementing_interface,Child
{
	String proj_name=new String();
	Scanner s;
	@Override
	public void in() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Project name :");
		s=new Scanner(System.in);
		proj_name=s.next();
		
	}

	@Override
	public void out() {
		// TODO Auto-generated method stub
		System.out.println("The Project name is :"+proj_name);
		System.out.println("The Department name is :"+dept_name);
		System.out.println("The Department number is :"+dept_no);
		
		
	}

	@Override
	public void access() {
		// TODO Auto-generated method stub
		
		System.out.println("Accessing the project number :"+proj_no);
		
	}
	
}
	 class Hill extends Hi
	{
	public static void main(String args[])
	{
		Hill a =new Hill();
		a.in();
		a.access();
		a.out();
		
	}
	}

	