
public class SystemTimer 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		long startTimer = System.nanoTime();
		
		
		
		for (int i = 0; i < 10000000; i++) 
		{
			for (int j = 0; j < 10000000; j++) 
			{
				int num = i * j;
			}
		}
		
		long endTime = System.currentTimeMillis();
		long endTimer = System.nanoTime();
		System.out.println(endTime - startTime);
		System.out.println(endTimer - startTimer);		
	}

}
