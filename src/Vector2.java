
public class Vector2
{
	private Point2 location;
	private double xComponent;
	private double yComponent;
	private double angle;
	private double magnitude;
	
	public Vector2()
	{
		location = new Point2();
		xComponent = 0;
		yComponent = 0;
		angle = 0;
		magnitude = 0;
	}
	
	public Vector2(double x, double y, int xx, int yy)
	{
		xComponent = x;
		yComponent = y;
		location = new Point2(xx, yy);
		angle = Math.atan2(x, y);
		magnitude = Math.sqrt(x*x + y*y);
	}
	
	public Vector2(Vector2 v)
	{
		xComponent = v.getComponentX();
		yComponent = v.getComponentY();
		location = new Point2(v.getLocation());
		angle = v.getRadian();
		magnitude = v.getMagnitude();
	}
	
	public double getComponentX()
	{
		return xComponent;
	}
	
	public double getComponentY()
	{
		return yComponent;
	}
	
	public void setComponentX(double x)
	{
		xComponent = x;
	}
	
	public void setComponentY(double y)
	{
		yComponent = y;
	}
	
	public int getX()
	{
		return location.getX();
	}
	
	public int getY()
	{
		return location.getY();
	}
	
	public void setX(int x)
	{
		location.setX(x);
	}
	
	public void setY(int y)
	{
		location.setY(y);
	}
	
	public Point2 getLocation()
	{
		return location;
	}
	
	public void setLocation(Point2 p)
	{
		location = p;
	}
	
	public void setLocation(int x, int y)
	{
		location.setX(x);
		location.setY(y);
	}
	
	public double distance(Vector2 v)
	{
		return Math.sqrt(Math.pow((getX() - v.getX()), 2) + Math.pow((getY() - v.getY()), 2));
	}
	
	public double squaredDistance(Vector2 v)
	{
		return (Math.pow((getX() - v.getX()), 2) + Math.pow((getY() - v.getY()), 2));
	}
	
	public int distanceX(Vector2 v)
	{
		return getX() - v.getX();
	}
	
	public int distanceY(Vector2 v)
	{
		return getY() - v.getY();
	}
	
	public double getDegree()
	{
		return Math.toDegrees(angle);
	}
	
	public double getRadian()
	{
		return angle;
	}
	
	public double getMagnitude()
	{
		return magnitude;
	}
	
}
