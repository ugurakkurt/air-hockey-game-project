
public class ScoreIncrease extends PowerUpCoin
{
	private int count = 3;
	private int[] scoreBonus = new int[count];
	
	public ScoreIncrease()
	{
		super();
		image = null;
		FLAG = 50;
		
		for(int i = 1; i <= count; ++i)
			scoreBonus[i-1] = 10*i;
	}
	
	public int generateBonus()
	{
		int rand = (int)(Math.random()*4);
		
		return scoreBonus[rand];
	}

}
