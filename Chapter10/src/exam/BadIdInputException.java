package exam;

public class BadIdInputException extends Exception 
{

	public BadIdInputException() 
	{
		super("아이디에 잘못된 문자를 입력함");
	}
		
}
