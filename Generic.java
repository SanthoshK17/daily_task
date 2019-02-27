package pack;

class Parameter<Arg1,Arg2>
{
	Arg1 obj1;
	Arg2 obj2;
	
	Parameter(Arg1 obj1,Arg2 obj2)
	{
		this.obj1 = obj1; 
        this.obj2 = obj2;
	}
	
	 public void print() 
	    { 
	        System.out.println(obj1); 
	        System.out.println(obj2); 
	    }

}

public class Generic {
		
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Parameter<Double,Integer> p= new Parameter<Double,Integer>(12.5,100);
		p.print();
		
	}

}
