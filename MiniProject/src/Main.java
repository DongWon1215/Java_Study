import java.util.Scanner; 

public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Contact ui = new Contact();
		
//		ui.ShowInfo();
		Scanner sc = new Scanner(System.in);

		SmartPhone phone = SmartPhone.getInstance();
		
		/////////////////////////////////////////////////////////////
//		System.out.println("�̸� : "+ ui.getName());
//		System.out.println("��ȭ��ȣ : "+ ui.getPhoneNumber());
//		System.out.println("�̸��� : "+ ui.getEMail());
//		System.out.println("�ּ� : "+ ui.getAddress());
//		System.out.println("���� : "+ ui.getBirth());
//		System.out.println("�׷� : "+ ui.getGroup());
		
		//////////////////////////////////////////////////////////
		
		while(true)
		{
			System.out.println("1. �߰�, 2. ���� 3. �˻�, 4. ���, 5. ����, 0. ����");
			switch(sc.nextInt())
			{
				case 1:
					System.out.println("�̸�, ��ȭ��ȣ, �̸���, �ּ�, ����, �׷��� ������� �Է��Ͻÿ�");
					Contact user = new Contact(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next());
						if(phone.addPerson(user))
							System.out.println("�ּҷ� �߰� ����");
						
						else 
							System.out.println("�ּҷ� �߰� ����");
					break;
	
				case 2:
					System.out.println("������ ��ȣ, ������ �̸�, ������  ��ȭ��ȣ, ������  �̸���, ������  �ּ�, ������  ����, ������  �׷��� ������� �Է��Ͻÿ�");
						if(phone.editPerson(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next()))
							System.out.println("�ּҷ� ���� ����");
						
						else 
							System.out.println("�ּҷ� ���� ���");
					break;
	
				case 3:
					System.out.println("�˻��� �̸��� �Է��Ͻÿ�");
						if(!phone.searchPerson(sc.next()))
							System.out.println("�ּҷ� �˻� ����");
					break;
				case 4:
						if(!phone.searchPeople())
							System.out.println("�ּҷ� ��� ����");
					break;
				case 5:
					System.out.println("������ �����Ͱ� �ִ� ��ȣ�� �Է��Ͻÿ�");
						if(phone.deletePerson(sc.nextInt()))
							System.out.println("�ּҷ� ���� ����");
						
						else 
							System.out.println("�ּҷ� ���� ����");
					break;
					
				case 0:
					return;
					
					default:
						System.out.println("�߸��� ���� �Է��Ͽ����ϴ�");					
			}

			//ui.ShowInfo();
		
		//phone.addPerson(ui);
		}
		//sc.close();
	}
}