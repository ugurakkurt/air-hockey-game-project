import java.io.Serializable;
import java.util.ArrayList;

public class Map implements Serializable
{
	private Puck puck;
	private ArrayList<Bar> bars;
	private ArrayList<Goal> goals;
	private ArrayList<Coin> coins;
	private ArrayList<Block> blocks;
	
	public Map()
	{
		puck = null;
		bars = null;
		goals = null;
		coins = null;
		blocks = null;
	}

}
