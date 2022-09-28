import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt(), j = sc.nextInt();
		if(j == 0)
			{
				System.out.println("0으로 나눌 순 없다");
			}
		else
			System.out.println(i/j);
			
		
		
		
		try
		{
			
		}
		
		catch(ArithmeticException e)
		{
			
		}
		
		catch(Exception e)
		{
			
		}
		
	}

}
