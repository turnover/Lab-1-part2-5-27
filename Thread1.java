
public class Thread1 implements Runnable
{
	private final long counter;
	
	public Thread1(long counter)
	{
		this.counter = counter;
	}
	public void run()
	{
		long sum = 0;
		Dice1 dice = new Dice1();
		sum += dice.roll();
		System.out.println("The Dice "+counter+"Landed On "+sum);
	}
}
