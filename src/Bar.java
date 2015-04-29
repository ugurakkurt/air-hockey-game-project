
public class Bar extends GameObject
{
	protected int speed;
	protected int speedState;
	protected boolean visible;
	
	public Bar()
	{
		super();
		xDim = 100;
		speed = 20;
		speedState = 0;
		visible = true;
	}
	
	public void setSpeed(int s)
	{
		if(s > 0)
			speed = 30;
		else
			speed = 10;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public void setSpeedState()
	{
		speedState = 10;
	}
	
	public int getSpeedState()
	{
		return speedState;
	}
	
	public void tick()
	{
		if(speedState > 0)
			speedState--;
	}
	
	public void setVisibility(boolean v)
	{
		visible = v;
	}
	
	public boolean isVisible()
	{
		return visible;
	}
	
	public void setDimY(int y){}

}
