package exam;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
//		System.out.println("���ڸ� �Է��Ͻÿ�");
//		int num = 0;
//		
//		try 
//		{		
//			num = sc.nextInt();	
//			System.out.println(num);
//		}
//		catch(InputMismatchException e)
//		{
//			System.out.println("���ܹ߻�");
//			System.out.println("�������� ���� X");
//		}
		
		System.out.println("���̵� �Է��Ͻÿ�");
		
			//���ڸ� -> ^[0-9]*$
			//��� -> ^[a-zA-Z]*$
			//�ѱ۸� ->^[��-�R]*$
			//���� + ���� ->[^a-zA-Z0-9]*$
			//�̸��� -> ^[a-zA-Z0-9] + @ + [a - zA -Z9]\\.+[a-zA-Z]+$
			//�ڵ��� ��ȣ : ^\\d{3} - \\d{4} - \\d{4}
			
			// ? : ���� ���ڰ� �ϳ��̰Ŵ� ���ų�
			
			// \\d : [0,9]
			// ? : ���� ���ڰ� �ϳ��̰ų� ������
			// w : ���ĺ� + ����
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
