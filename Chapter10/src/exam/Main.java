package exam;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
//		System.out.println("숫자를 입력하시오");
//		int num = 0;
//		
//		try 
//		{		
//			num = sc.nextInt();	
//			System.out.println(num);
//		}
//		catch(InputMismatchException e)
//		{
//			System.out.println("예외발생");
//			System.out.println("정상적인 숫자 X");
//		}
		
		System.out.println("아이디를 입력하시오");
		
			//숫자만 -> ^[0-9]*$
			//영어만 -> ^[a-zA-Z]*$
			//한글만 ->^[가-힣]*$
			//영어 + 숫자 ->[^a-zA-Z0-9]*$
			//이메일 -> ^[a-zA-Z0-9] + @ + [a - zA -Z9]\\.+[a-zA-Z]+$
			//핸드폰 번호 : ^\\d{3} - \\d{4} - \\d{4}
			
			// ? : 앞의 문자가 하나이거니 없거나
			
			// \\d : [0,9]
			// ? : 앞의 문자가 하나이거나 없가나
			// w : 알파벳 + 숫자
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
