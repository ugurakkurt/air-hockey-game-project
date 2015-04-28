import java.awt.Color;
import java.awt.Image;


public class Block extends GameObject
{
	protected boolean breakable;
	protected boolean visible;
	protected int hitCount;
	protected int hitLimit;
	
	public Block()
	{
		super();
		yDim = 100;
		breakable = false;
		visible = true;
		hitCount = 0;
		hitLimit = -1;
	}
	
	public Block(int hitLimit)
	{
		super();
		yDim = 100;
		breakable = (hitLimit > 0);
		visible = true;
		hitCount = 0;
		this.hitLimit = hitLimit;
	}
	
	public Block(int xDim, int yDim, Image i, Vector2 v)
	{
		super(xDim, yDim, i, v, false);
		this.yDim = 100;
		breakable = false;
		visible = true;
		hitCount = 0;
		hitLimit = -1;
	}
	
	public void gotHit()
	{
		hitCount++;
		
		if(hitLimit > 0)
			hitLimit--;
		
		if(hitLimit == 0)
			visible = false;
	}
	
	public boolean isBreakable()
	{
		return breakable;
	}
	
	public int getLimit()
	{
		return hitLimit;
	}
	
	public boolean isVisible()
	{
		return visible;
	}
	
	public int getHitCount()
	{
		return hitCount;
	}
	
}
