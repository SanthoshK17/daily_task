package pack;

import java.util.Scanner;

final class change
{
	int rno;
	 String name;
	
	change(String k,int l){
		name="Santhosh";
		rno=22;
	}
	
	 final void setter(String name,int rno)
	 {
		this.name=name;
		this.rno=rno;
	 }
	final void getter()
	{
		System.out.println("Name of the Employee: "+name);
		System.out.println("ID number of the Employee: "+rno);
	}
	
}


public class using_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nam=new String();
		int rn;
		change c=new change("Sandy",22);
		
		System.out.println("Enter the name of the Employee: ");
		Scanner b=new Scanner(System.in);
		nam=b.next();
		
		System.out.println("Enter the name of the Employee: ");
		rn=b.nextInt();
		
		c.setter(nam,rn);
		c.getter();
		b.close();
		 

	}

}
