package Ver07;
import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SmartPhone {
	
	private static final int MAX_PERSON_NUM = 10;
	private Scanner sc = new Scanner(System.in);
	private List<Contact> user = new ArrayList<Contact>();

	private boolean isInNumRange(int index) 
	{
		if(index < user.size())
			return true;
		
		return false;
	}
	
	private boolean matchPerson(int index) 
	{
		user.get(index).ShowData();
		System.out.println("������ ����� ������ �½��ϱ�?");
		System.out.println("Yes or No");
		
		if(sc.next().equalsIgnoreCase("Yes"))
			return true;
		
		return false;
	}
	
	private boolean referenceCheck(String phoneNum)
	{
		for (int i = 0; i < user.size(); i++) 
		{
			if(user.get(i).getPhoneNumber() == phoneNum)
				return false;
		}
		
		return true;
	}
	
	private static SmartPhone addressBook = new SmartPhone();
	
	public static SmartPhone getInstance()
	{
		if(addressBook == null)
			addressBook = new SmartPhone();
			return addressBook;
	}
	
	public boolean searchPerson(String name)
	{
		if(user.isEmpty())
			System.out.println("�˻� �� �����Ͱ� �����ϴ�");
		
		else
		{
			for(int i = 0; i < user.size(); i++)
			{
				if(user.get(i).getName().equalsIgnoreCase(name))
				{
					System.out.println(" Index = " + (i + 1));
					user.get(i).ShowData();
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean searchPeople()
	{
		for(int i = 0; i < user.size(); i++)
			{
			System.out.println(" Index = " + (i + 1));
				user.get(i).ShowData();
				System.out.println("====================================================================");
				
				if(i == user.size() - 1)
				return true;
			}
		return false;
	}
	
	public boolean addPerson(Contact ct)
	{
		if(user.size() >= MAX_PERSON_NUM)
			System.out.println("�ִ� �ο� ���� �����Ͽ����ϴ�");
		
		else
		{
			try
			{

				if(ct.getPhoneNumber().indexOf("-") == -1)
				{
					InputMismatchException e = new InputMismatchException();
					throw e;
				}
				if(!referenceCheck(ct.getPhoneNumber()))
				{
					Exception e = new Exception();
					throw e;
				}
					user.add(ct);
					return true;
			}
			catch(InputMismatchException e)
			{
				System.out.println("�߸��� ������ ��ȣ�� �Է��߽��ϴ�");	
			}
			catch(Exception e)
			{
				System.out.println("�ߺ��� ��ȣ�� ������ �� �����ϴ�");		
			}
		}
		return false;
	}
	
	public boolean deletePerson(int index)
	{
		if(user.isEmpty())
			System.out.println("���� �� �ִ� �����Ͱ� �����ϴ�");
			
		else
		{
			if(matchPerson(index) && isInNumRange(index))
			{
				user.remove(index);
				return true;
			}
			
			else
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�");
		}
		return false;
	}
	
	public boolean editPerson(int index, String name, String phoneNumber, String eMail, String address, String birth, String group)
	{

		if(user.isEmpty())
			System.out.println("���� �� �� �ִ� �����Ͱ� �����ϴ�");
		
		else  
		{
			if(matchPerson(index))
			{
				user.get(index).setName(name);
				user.get(index).setPhoneNumber(phoneNumber);
				user.get(index).setEMail(eMail);
				user.get(index).setAddress(address);
				user.get(index).setBirth(birth);
				user.get(index).setGroup(group);
				
				return true;
			}
		}
		return false;
	}
	
	public int getAddressRealLength()
	{
		return user.size();
	}
}
