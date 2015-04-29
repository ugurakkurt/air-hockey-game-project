import java.awt.Color;

public class Coin extends GameObject
{
	protected boolean visible;
	protected int duration;
	protected int FLAG; // positive values are power-ups, negative values are penalties
	
	public Coin()
	{
		super();
		color = Color.BLUE;
		FLAG = 0; // indicates that this coin has not attained its type yet
		visible = false;
		duration = 0;
	}
	
	public int getType()
	{
		return FLAG;
	}
	
	public void setDuration(int duration)
	{
		this.duration = duration;
		
		if(duration > 0)
			visible = true;
		
		if(duration == 0)
			visible = false;
	}
	
	public int getDuration()
	{
		return duration;
	}
	
	public boolean getVisibility()
	{
		return visible;
	}
	
	public void tick()
	{
		if(duration > 0)
			duration--;
		
		if(duration == 0)
			visible = false;
	}

}
