package Ver04;
import java.util.Scanner; 

public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		SmartPhone phone = SmartPhone.getInstance();
		while(true)
		{
			System.out.println("1. ȸ�� ���� �߰�, 2. �� ���� �߰�, 3. ���� 4. �˻�, 5. ���, 6. ����, 0. ����");
			switch(sc.nextInt())
			{
				case 1:
					System.out.println("�̸�, ��ȭ��ȣ, �̸���, �ּ�, ����, �׷�, ȸ���, �μ���, ������ ������� �Է��Ͻÿ�");
					Contact company = new CompanyContact(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next());
						if(phone.addPerson(company))
							System.out.println("�ּҷ� �߰� ����");
						
						else 
							System.out.println("�ּҷ� �߰� ����");
					break;
	
				case 2:
					System.out.println("�̸�, ��ȭ��ȣ, �̸���, �ּ�, ����, �׷�, �ŷ�ó��, �μ���, ���� �� ������� �Է��Ͻÿ�");
					Contact customer = new CustomerContact(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next());
						if(phone.addPerson(customer))
							System.out.println("�ּҷ� �߰� ����");
						
						else 
							System.out.println("�ּҷ� �߰� ����");
					break;
					
				case 3:
					System.out.println("������ ��ȣ, ������ �̸�, ������  ��ȭ��ȣ, ������  �̸���, ������  �ּ�, ������  ����, ������  �׷��� ������� �Է��Ͻÿ�");
						if(phone.editPerson(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next()))
							System.out.println("�ּҷ� ���� ����");
						
						else 
							System.out.println("�ּҷ� ���� ���");
					break;
	
				case 4:
					System.out.println("�˻��� �̸��� �Է��Ͻÿ�");
						if(!phone.searchPerson(sc.next()))
							System.out.println("�ּҷ� �˻� ����");
					break;
				case 5:
						if(!phone.searchPeople())
							System.out.println("�ּҷ� ��� ����");
					break;
				case 6:
					System.out.println("������ �����Ͱ� �ִ� ��ȣ�� �Է��Ͻÿ�");
						if(phone.deletePerson(sc.nextInt()))
							System.out.println("�ּҷ� ���� ����");
						
						else 
							System.out.println("�ּҷ� ���� ����");
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