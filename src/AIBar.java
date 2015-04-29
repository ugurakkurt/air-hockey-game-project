
public class AIBar extends Bar
{
	private boolean easy;
	
	public AIBar()
	{
		super();
		easy = true;
	}
	
	public boolean getDifficulty()
	{
		return easy;
	}
	
	public void setDifficulty(boolean diff)
	{
		easy = diff;
		
		if(diff)
			speed = 10;
		else
			speed = 30;
	}

}
