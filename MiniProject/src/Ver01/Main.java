package Ver01;
import java.util.Scanner; 

public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Contact ui = new Contact();
		
		ui.ShowInfo();
		Scanner sc = new Scanner(System.in);
		
		/////////////////////////////////////////////////////////////
		System.out.println("�̸� : "+ ui.getName());
		System.out.println("��ȭ��ȣ : "+ ui.getPhoneNumber());
		System.out.println("�̸��� : "+ ui.getEMail());
		System.out.println("�ּ� : "+ ui.getAddress());
		System.out.println("���� : "+ ui.getBirth());
		System.out.println("�׷� : "+ ui.getGroup());
		
		//////////////////////////////////////////////////////////
		
		ui.ShowInfo();
		
		sc.close();
	}
}