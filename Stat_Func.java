package pack;

public class Stat_Func {
	
	static void disp()
	{
		System.out.println("Inside the static display method");
	}
	void show()
	{
		System.out.println("Inside normal method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stat_Func s=new Stat_Func();
		s.show();
		disp();
	}

}
