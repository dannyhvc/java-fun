package Year_1.Exception;

public class Example1 {

	public static void main(String[] args)
	{
		
		System.out.println(5/0);//unchecked exception.
	/**
		try 
		{
			System.out.println(5/0);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Arithmetic exception caught, message is: "+ex.getMessage());
		}
		*/
	}
}
