
public class MyThread2 implements Runnable
{

	@Override
	public void run() 
	{
		for (int i = 0; i < 100; i++) 
		{
			System.out.println("runnable 메소드 실행");
		}
	}
	
}
