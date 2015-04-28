
public class BreakableBlock extends Block
{
	public BreakableBlock()
	{
		super();
		hitLimit = 1;
		breakable = true;
	}
	
	public BreakableBlock(int hitLimit)
	{
		super(hitLimit);
	}

}
