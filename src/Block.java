import java.awt.Color;
import java.awt.Image;


public class Block extends GameObject
{
	protected boolean breakable;
	protected boolean visible;
	protected int hitCount;
	
	public Block()
	{
		super();
		yDim = 100;
		breakable = false;
		visible = true;
		hitCount = -1;
	}
	
	public Block(int xDim, int yDim, Image i, Vector2 v, boolean m)
	{
		super(xDim, yDim, i, v, m);
		this.yDim = 100;
		breakable = false;
		visible = true;
		hitCount = -1;
	}
	
	
	
}
