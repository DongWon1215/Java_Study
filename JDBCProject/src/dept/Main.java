package dept;

import java.util.Scanner;

import dept.controller.InsertController;
import dept.controller.ResearchController;
import dept.controller.SelectController;
import dept.controller.UpdateController;

public class Main {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Controller con = new Controller();
		
		while(true)
		{
			menu();
			System.out.println("�޴��� �Է��Ͻÿ�");
			int select = Integer.parseInt(sc.nextLine());
			
			switch(select)
			{
			case 1:
				new SelectController().process();
				break;

			case 2:
				new ResearchController().process();
				break;

			case 3:
				new InsertController().process();
				break;

			case 4:
				new UpdateController().process();
				break;

			case 5:
				//con.delete();
				break;

			case 6:
				//con.exit();
			}
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
