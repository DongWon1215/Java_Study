import java.util.Scanner;

public class ExceptionTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Scanner sc = null;
//		try
//		{
//			sc = new Scanner(System.in);
//			
//		}
//		
//		finally
//		{
//			if(sc != null)
//			sc.close();			
//		}
		
		
		try(Scanner sc = new Scanner(System.in))
		{
			
		}
		
		catch(Exception e)
		{
			
		}
	}

}
