package pack;
class ChildThread1 extends Thread 
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	System.out.println("Inside run");	
	for(int i=1;i<5;i++){  
	    try{
	    	Thread.sleep(3000);
	    	}
	    catch(InterruptedException e)
	    {
	    	System.out.println(e);
	    	}  
	    System.out.println(i);  
	  }  
	}
}
	
	
public class GTS_Thread {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread a = new Thread();
		ChildThread1 c=new ChildThread1();
		c.start();
		System.out.println("Name of the thread is :"+a.getName());
		System.out.println("Name of the thread is :"+c.getName());
		
		}

		
		}
		
		      
