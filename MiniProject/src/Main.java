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
		System.out.println("�̸�, ��ȭ��ȣ, �̸���, �ּ�, ����, �׷��� ������� �Է��Ͻÿ�");
		ui.setName(sc.next());
		ui.setPhoneNumber(sc.next());
		ui.setEMail(sc.next());
		ui.setAddress(sc.next());
		ui.setBirth(sc.next());
		ui.setGroup(sc.next());

		ui.ShowInfo();
		sc.close();
		
		SmartPhone phone = new SmartPhone();
		
		
		
		
	}
}