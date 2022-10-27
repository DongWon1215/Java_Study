package dept;

import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Command command = new Command();
		
		
		while(true)
		{
			menu();
			System.out.println("�޴��� �Է��Ͻÿ�");
			int select = Integer.parseInt(sc.nextLine());
			
			//list.get(select).process();
			command.command.get(select).process();
		}
		
	}
	
	public static void menu()
	{
		System.out.println("�μ� ���� ���α׷�");
		
		System.out.println("1. ��ü �μ� ����Ʈ");
		System.out.println("2. �μ� �˻�");
		System.out.println("3. �μ� ���� ����");
		System.out.println("4. �μ� ���� ����");
		System.out.println("5. �μ� ���� ����");
		System.out.println("6. ���α׷� ����");
	}
	
}
