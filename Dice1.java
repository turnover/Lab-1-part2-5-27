import java.util.Random;

public class Dice1 
{
	Random random = new Random();
	
	public Dice1()
	{	
	}
	public int roll()
	{
		return random.nextInt(6)+1;
	}
}
