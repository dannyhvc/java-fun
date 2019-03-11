package Exception;

public class InvalidRadiusException extends Exception
{
	
	private double radius;
	
	InvalidRadiusException(double r)
	{
		super("Invalid radius: "+r);
		this.radius = r;
	}
	
	public double getRadius()
	{
		return radius;
	}
}
