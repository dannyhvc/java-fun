package Exception;

public class CircleOne {
	
	private double radius;
	
	CircleOne(double r) throws InvalidRadiusException
	{
		if (r < 0)
		{
			throw new InvalidRadiusException(r);
		}
		else
		{
			this.radius = r;
		}
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) throws InvalidRadiusException {
		
		if (radius < 0)
		{
			throw new InvalidRadiusException(radius);
		}
		else
		{
			this.radius = radius;
		}
		
	}
	
	

}
