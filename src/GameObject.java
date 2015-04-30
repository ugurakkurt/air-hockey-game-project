
import java.awt.Color;
import java.awt.Image;
import java.io.Serializable;

public class GameObject implements Serializable
{	
	protected int xDim;
	protected int yDim;
	protected Color color;
	protected Image image;
	protected Vector2 vector;
	protected boolean movable;
	
	public GameObject()
	{
		xDim = 50;
		yDim = 50;
		color = Color.RED;
		image = null;
		vector = new Vector2();
		movable = false;
	}
	
	public GameObject(int xDim, int yDim, Color c, Vector2 v, boolean m)
	{
		this.xDim = xDim;
		this.yDim = yDim;
		color = c;
		image = null;
		vector = new Vector2(v);
		movable = m;
	}
	
	public GameObject(int xDim, int yDim, Image i, Vector2 v, boolean m)
	{
		this.xDim = xDim;
		this.yDim = yDim;
		color = Color.RED;
		image = i;
		vector = new Vector2(v);
		movable = m;
	}
	
	public int getDimX()
	{
		return xDim;
	}
	
	public int getDimY()
	{
		return yDim;
	}
	
	public void setDimX(int x)
	{
		xDim = x;
	}
	
	public void setDimY(int y)
	{
		yDim = y;
	}
	
	public void changeColor(Color c)
	{
		color = c;
	}
	
	public void changeImage(Image i)
	{
		image = i;
	}
	
//	public void setMovability(boolean m)
//	{
//		movable = m;
//	}
	
	public boolean isMovable()
	{
		return movable;
	}
	
	public int getX()
	{
		return vector.getX();
	}
	
	public int getY()
	{
		return vector.getY();
	}
	
	public void setX(int x)
	{
		vector.setX(x);
	}
	
	public void setY(int y)
	{
		vector.setY(y);
	}
	
	public Point2 getLocation()
	{
		return vector.getLocation();
	}
	
	public void setLocation(Point2 p)
	{
		vector.setLocation(p);
	}
	
	public void setLocation(int x, int y)
	{
		vector.setLocation(x, y);
	}
	
	public Vector2 getVect()
	{
		return vector;
	}
	
	public double distance(GameObject o)
	{
		return vector.distance(o.getVect());
	}
	
	public double squaredDistance(GameObject o)
	{
		return vector.squaredDistance(o.getVect());
	}
	
	public int distanceX(GameObject o)
	{
		return vector.distanceX(o.getVect());
	}
	
	public int distanceY(GameObject o)
	{
		return vector.distanceY(o.getVect());
	}
	
}
