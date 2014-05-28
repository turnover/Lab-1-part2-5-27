
public class Test 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(int i = 0; i <25; i++)
		{
			Runnable T1 = new Thread1(i);
			Thread worker = new Thread(T1);
			worker.setName(String.valueOf(i));
			worker.start();
		}
	}

}
