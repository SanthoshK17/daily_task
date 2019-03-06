package pack;

public class Equals_NoOverride {

	String name;
	int id_no;
	
	public Equals_NoOverride(String name,int id_no) 
	{
		this.name = name;
		this.id_no = id_no; 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Equals_NoOverride h1= new Equals_NoOverride("Sandy",12);
		Equals_NoOverride h2= new Equals_NoOverride("Sandy",12);
		
		System.out.println("H_1 hashcode = " + h1.hashCode()); 
		System.out.println("H_2 hashcode = " + h2.hashCode()); 
		System.out.println("Checking equality between H_1 and H_2 = " + h1.equals(h2));
	}

}
