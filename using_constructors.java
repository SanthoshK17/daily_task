package pack;
class actual{
	
	 actual() {
		System.out.println("Constructor with no parameter");
	}
	actual(int i)
	{
		i=i*i;
		System.out.println("Inside the Parameterized constructor "+i);
	}
	int method(int l) {
		l=-l;
		return l;
	}
}
public class using_constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b;
		actual a= new actual(8);
		b=a.method(7);
		System.out.println("Back to main(): "+b);
		
	}

}
