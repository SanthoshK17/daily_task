package pack;

public class DoubleThreads implements Runnable{
	
	 public void run()
	{
		for(int i=1;i<5;i++){  
		    try
		    {
		    	Thread.sleep(2500);
		    }catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    	}  
		    System.out.println(i+"  "+Thread.currentThread());   
		}
		    
		   
	}	

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleThreads dr1=new DoubleThreads();
		DoubleThreads dr2=new DoubleThreads();
		Thread t1=new Thread(dr1);
		Thread t2=new Thread(dr2);
		System.out.println("Name of the Thread: "+t1.getName());
		System.out.println("Name of the Thread: "+t2.getName());
		
		t1.setName("T_1");
		t2.setName("T_2");
		
		System.out.println("Name of the Thread: "+t1.getName());
		System.out.println("Name of the Thread: "+t2.getName());
		
		t1.start();
		t2.start();
		
	}
	

}
