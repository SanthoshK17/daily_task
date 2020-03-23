package Excercise;

class B
{
	int num=25;
	
	int getResult() 
	{
		
		return num*2;
		
	}
}
public class Di {

	private static B objectB;

	 
	public Di(B objectB) {
	  this.objectB = objectB; 
	 }

	 public int doSomeWork() {
		 System.out.println("Reached here");
	  int result = objectB.getResult();
	  int finalResult = result * 2;
	  return finalResult;
	 } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Di a = new Di(objectB);
		System.out.println("Reached here");
		int res = a.doSomeWork();
		
		System.out.println("Value of result ="+res);
		
	}

}
