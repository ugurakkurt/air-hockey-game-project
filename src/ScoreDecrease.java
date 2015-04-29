
public class ScoreDecrease extends PenaltyCoin
{
	private int count = 3;
	private int[] scoreDecrease = new int[count];
	
	public ScoreDecrease()
	{
		super();
		image = null;
		FLAG = -50;
		
		for(int i = 1; i <= count; ++i)
			scoreDecrease[i-1] = -10*i;
	}
	
	public int generateDecrease()
	{
		int rand = (int)(Math.random()*4);
		
		return scoreDecrease[rand];
	}

}
