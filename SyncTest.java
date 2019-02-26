package pack;


class MessageSender
{
	public void send(String msg)
	{
		System.out.println("Sending  " +msg);
		try {
			
			Thread.sleep(1000);
			
		} catch (Exception e) {
			System.out.println("Exception Occured");
		}
		System.out.println(msg+" Sent");
	}
}

class ThreadSender extends Thread
{
	private String msg;
	MessageSender s;
	
	public ThreadSender(String m, MessageSender obj) {
		msg=m;
		s=obj;
	}
	
	@Override
	public void run() {
		synchronized(s)
		{
			s.send(msg);
		}
	}
	
	
	
}

public class SyncTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MessageSender m1=new MessageSender();
		ThreadSender ts=new ThreadSender("Hi", m1);
		ThreadSender ts1=new ThreadSender("Bye", m1);
		
		ts.start();
		ts1.start();
		
		try {
			ts.join();
			ts1.join();
		} catch (Exception e) {
			System.out.println("Exception Occured in Main Method");
		}

	}

}
