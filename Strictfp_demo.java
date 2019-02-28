package pack;

public class Strictfp_demo {

	 public strictfp double sum() 
	    { 
	        double num1 = 10e+10; 
	        double num2 =6.5;
	        double num3 =12.5;		
	        return (num1+num2+num3); 
	  
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub    
		        Strictfp_demo t = new Strictfp_demo(); 
		        System.out.println(t.sum()); 
		
	}

}

	