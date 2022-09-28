package exam;


public class RuntimeCalculator {
	
	public static void main(String[] args) {
		long oldtimer = System.currentTimeMillis();
		
		int num = 0;
		
		for (int i = 0; i < 1000000000; i++) 
		{
			num += i;
		}
		
		long newtimer = System.currentTimeMillis();
		
		System.out.println(newtimer - oldtimer);
	}
	
}
