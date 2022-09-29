package exam;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
//		System.out.println("¼ýÀÚ¸¦ ÀÔ·ÂÇÏ½Ã¿À");
//		int num = 0;
//		
//		try 
//		{		
//			num = sc.nextInt();	
//			System.out.println(num);
//		}
//		catch(InputMismatchException e)
//		{
//			System.out.println("¿¹¿Ü¹ß»ý");
//			System.out.println("Á¤»óÀûÀÎ ¼ýÀÚ X");
//		}
		
		System.out.println("¾ÆÀÌµð¸¦ ÀÔ·ÂÇÏ½Ã¿À");
		
			//¼ýÀÚ¸¸ -> ^[0-9]*$
			//¿µ¾î¸¸ -> ^[a-zA-Z]*$
			//ÇÑ±Û¸¸ ->^[°¡-ÆR]*$
			//¿µ¾î + ¼ýÀÚ ->[^a-zA-Z0-9]*$
			//ÀÌ¸ÞÀÏ -> ^[a-zA-Z0-9] + @ + [a - zA -Z9]\\.+[a-zA-Z]+$
			//ÇÚµåÆù ¹øÈ£ : ^\\d{3} - \\d{4} - \\d{4}
			
			// ? : ¾ÕÀÇ ¹®ÀÚ°¡ ÇÏ³ªÀÌ°Å´Ï ¾ø°Å³ª
			
			// \\d : [0,9]
			// ? : ¾ÕÀÇ ¹®ÀÚ°¡ ÇÏ³ªÀÌ°Å³ª ¾ø°¡³ª
			// w : ¾ËÆÄºª + ¼ýÀÚ
//		try 
//		{	
//			if(sc.nextLine().indexOf("[^a-zA-Z0-9]*") != -1)
//			{
//				BadIdInputException e = new BadIdInputException();
//				throw e;
//			}
//		}
//		catch(BadIdInputException e)
//		{
//			
//		}
		System.out.println(Pattern.matches("\\d{3}-\\d{4}-\\{4}",sc.nextLine()));
	}
}
