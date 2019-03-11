package Exception;

public class CircleTester {
	
	public static void main(String[] args)
	{
		CircleOne c1 = null;
		
		try
		{
			c1 = new CircleOne(5);
		}
		catch(InvalidRadiusException ex)
		{
			System.out.println("Radius of the circle is " + c1.getRadius());
		}
		
		System.out.println("Radius of my circle is " + c1.getRadius());
		
		System.out.println("Creating a negative radius circle..");
		
		CircleOne cnegative = null;
		
		try
		{
			cnegative = new CircleOne(-3.5);
		}
		catch(InvalidRadiusException ex)
		{
			System.out.println("Radius of the circle is " + ex.getMessage());
		}
	}
}
