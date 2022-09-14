package P1;

import java.util.Scanner;

public class S2_2 
{
	public static void main(String[] args) 
	{
		String name = null;
		String Phone_Number = null;
		String Social_Security_Number = null; 
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = s.nextLine();
		System.out.println();

		System.out.print("전화번호 : ");
		Phone_Number = s.nextLine();
		System.out.println();

		System.out.print("주민등록번호 : ");
		Social_Security_Number = s.nextLine();
		

		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + Phone_Number);
		System.out.println("주민등록번호 : " + Social_Security_Number);
		
		s.close();
		
	}
}
