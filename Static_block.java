package pack;

public class Static_block {
	
	static int a,b;
	int c,d;
	
	static
	{
		a=150;
		System.out.println("Inside static block 1, A= "+a);
	}
	static 
	{
		a=250;
		b=200;
		System.out.println("Inside static block 2, A= "+a+" "+ "B="+b);
	}
	
	void setter_cd(int i,int j)
	{
		System.out.println("Inside setter_cd()");
		c=i;
		d=j;
	}
	
	void setter_ab(int i,int j)
	{
		System.out.println("Inside setter_ab()");
		a=i;
		b=j;
	}
	
	void getter()
	{
		//System.out.println("Accessing through "+this.getClass().getName());
		System.out.println("Inside getter (), A= "+a);
		System.out.println("Inside getter (), B= "+b);
		System.out.println("Inside getter (), C= "+c);
		System.out.println("Inside getter (), D= "+d);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static_block obj_1=new Static_block();
		Static_block obj_2=new Static_block();
		
		
		obj_1.setter_ab(300,400);
		obj_1.getter();
		
		obj_2.setter_cd(350,450);
		obj_2.getter();
		
	}

}
