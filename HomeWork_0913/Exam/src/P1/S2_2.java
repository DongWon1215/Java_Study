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
		
		System.out.print("�̸� : ");
		name = s.nextLine();
		System.out.println();

		System.out.print("��ȭ��ȣ : ");
		Phone_Number = s.nextLine();
		System.out.println();

		System.out.print("�ֹε�Ϲ�ȣ : ");
		Social_Security_Number = s.nextLine();
		

		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + Phone_Number);
		System.out.println("�ֹε�Ϲ�ȣ : " + Social_Security_Number);
		
		s.close();
		
	}
}
