
public class Point2 
{	
	private int x;
	private int y;
	
	public Point2(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Point2()
	{
		x = 0;
		y = 0;
	}
	
	public Point2(Point2 p)
	{
		x = p.getX();
		y = p.getY();
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public double distance(Point2 p)
	{
		return Math.sqrt((this.x - p.getX())*(this.x - p.getX()) + (this.y - p.getY())*(this.y - p.getY()));
	}
	
	public int distX(Point2 p)
	{
		return Math.abs(this.x - p.getX());
	}
	
	public int distY(Point2 p)
	{
		return Math.abs(this.y - p.getY());
	}
	
}
