
public class Puck extends GameObject
{
	private double radius;
	
	public Puck()
	{
		super();
		movable = true;
		radius = xDim/2;
	}
	
	//@override
	public void setDimX(int x)
	{
		xDim = x;
		yDim = x;
		radius = x/2;
	}
	
	//@override
	public void setDimY(int y)
	{
		yDim = y;
		xDim = y;
		radius = y/2;
	}

}
