package Ver02;
import java.util.Scanner; 

class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		SmartPhone phone = SmartPhone.getInstance();
		
		
		while(true)
		{
			System.out.println("1. �߰�, 2. ����, 3. �˻�, 4. ���, 5. ����, 0. ����");
			switch(sc.nextInt())
			{
				case 1:
					System.out.println("�̸�, ��ȭ��ȣ, �̸���, �ּ�, ����, �׷��� ������� �Է��Ͻÿ�");
					Contact user = new Contact(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next());
						if(phone.addPerson(user))
							System.out.println("������ �߰� ����");
						
						else 
							System.out.println("������ �߰� ����");
					break;
	
				case 2:
					System.out.println("������ ��ȣ, ������ �̸�, ������  ��ȭ��ȣ, ������  �̸���, ������  �ּ�, ������  ����, ������  �׷��� ������� �Է��Ͻÿ�");
						if(phone.editPerson(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next()))
							System.out.println("������ ���� ����");
						
						else 
							System.out.println("������ ���� ���");
					break;
	
				case 3:
					System.out.println("�˻��� �̸��� �Է��Ͻÿ�");
						if(!phone.searchPerson(sc.next()))
							System.out.println("������ �˻� ����");
					break;
				case 4:
						if(!phone.searchPeople())
							System.out.println("������ ��� ����");
					break;
				case 5:
					System.out.println("������ �����Ͱ� �ִ� ��ȣ�� �Է��Ͻÿ�");
						if(phone.deletePerson(sc.nextInt()))
							System.out.println("������ ���� ����");
						
						else 
							System.out.println("������ ���� ����");
					break;
					
				case 0:
					System.out.println("���α׷��� �����մϴ�");
					return;
					
					default:
						System.out.println("�߸��� ���� �Է��Ͽ����ϴ�");					
			}
		}
		//sc.close();
	}
}