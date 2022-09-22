package Ver02;
import java.util.Scanner;

class SmartPhone {
	
	private int personCount;									// �迭�� ���ִ� ������ ������ ������ ����
	private static final int MAX_PERSON_NUM = 10;				// ���߿� �ִ� ������ ����� ��� ������ �����ϵ��� �ִ밪�� ������
	private Scanner sc = new Scanner(System.in);				// Ȯ�� ���� Ȯ�ο� ��ĳ��
	private Contact user[] = new Contact[MAX_PERSON_NUM];

	private boolean isInNumRange(int index) 					// ����� ������ �������� �� ���� ���ڸ� �Է��ߴ��� Ȯ��
	{
		if(index < personCount)
			return true;
		
		return false;
	}
	
	private boolean isThisPerson(int index) 					// ������ ����� �´��� Ȯ��
	{
		user[index].ShowInfo();
		System.out.println("������ ����� ������ �½��ϱ�?");
		System.out.println("Yes or No");
		
		if(sc.next().equalsIgnoreCase("Yes"))
			return true;
		
		return false;
	}
	
	private static SmartPhone addressBook = new SmartPhone();
	
	public static SmartPhone getInstance()
	{
		if(addressBook == null)
			addressBook = new SmartPhone();
			return addressBook;
	}
	
	public boolean searchPerson(String name)					// �Է��� �̸��� ������ �̸��� ���� ��ü�� �ִ��� Ȯ��
	{
		if(personCount == 0)
			System.out.println("�˻� �� �����Ͱ� �����ϴ�");
		
		else
		{
			for(int i = 0; i < personCount; i++)
			{
				if(user[i].getName().equalsIgnoreCase(name))
				{
					System.out.println(" Index = " + (i + 1));
					user[i].ShowInfo();
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean searchPeople()								// ����� ��� ��ü ���
	{
		for(int i = 0; i < personCount; i++)
			{
			System.out.println(" Index = " + (i + 1));
				user[i].ShowInfo();
				System.out.println("====================================================================");
				
				if(i == personCount - 1)
				return true;
			}
		return false;
	}
	
	public boolean addPerson(Contact ct)						// ��ü�� �迭�� �߰�
	{
		if(personCount >= MAX_PERSON_NUM)
			System.out.println("�ִ� �ο� ���� �����Ͽ����ϴ�");
		
		else
		{
			user[personCount] = ct;
			personCount++;
			return true;
		}
		return false;
	}
	
	public boolean deletePerson(int index)						// �迭�� ����� ��ü �˻� �� ����
	{
		if(personCount == 0)
			System.out.println("���� �� �ִ� �����Ͱ� �����ϴ�");
			
		else
		{
			if(isThisPerson(index) && isInNumRange(index))
			{
				for(int i = index; i < personCount - 1; i++)
				user[i] = user[i + 1];
				user[personCount] = null;
				personCount--;
				return true;
			}
			
			else
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�");
		}
		return false;
	}
	
	public boolean editPerson(int index, String name, String phoneNumber, String eMail, String address, String birth, String group)		//�迭�� ����� ��ü�� ������ ����
	{

		if(personCount == 0)
			System.out.println("���� �� �� �ִ� �����Ͱ� �����ϴ�");
		
		else 
		{
			if(isThisPerson(index))
			{
				user[index].setName(name);
				user[index].setPhoneNumber(phoneNumber);
				user[index].setEMail(eMail);
				user[index].setAddress(address);
				user[index].setBirth(birth);
				user[index].setGroup(group);
				
				return true;
			}
		}
		return false;
	}
}