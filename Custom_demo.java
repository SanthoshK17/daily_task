package pack;

class customed extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public customed(String s)
	{
	super(s);	
	}
}

public class Custom_demo  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 try
        { 
           
            throw new customed("Custom exception"); 
        } 
        catch (customed ex) 
        { 
            System.out.println("Caught"); 
  
            System.out.println(ex.getMessage()); 
      
		

	}

}
}

