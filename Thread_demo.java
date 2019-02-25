package pack;

class ChildThread extends Thread 
{  
    @Override
    public void run()  
    { 
        
            System.out.println("Child thread started"); 
        } 
    	}

public class Thread_demo extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread(); 
        int a,b;
		
        System.out.println("Current thread: " + t.getName()); 
          
        t.setName("Main_thread"); 
        System.out.println("After name change: " + t.getName()); 
        
        ChildThread ct = new ChildThread();
        ct.start(); 
        System.out.println("Main thread priority: "+ t.getPriority()); 
        t.setPriority(7); 
        a=t.getPriority();
        
        System.out.println("Main thread new priority: "+ t.getPriority()); 
         
          
        System.out.println("Child thread priority: "+ ct.getPriority());
        ct.setPriority(4); 
        b=ct.getPriority();
        
        System.out.println("Child thread new priority: "+ ct.getPriority()); 
        
        
       // System.out.println(a > b? "Main Thread has the highest priority" : "Child Thread has the highest priority");
      if(a>b)
    	  System.out.println("Main Thread has the highest priority "+a);
      else
    	  System.out.println("Child Thread has the highest priority "+b);
        
    } 
} 
  
