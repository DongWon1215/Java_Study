package Ver07;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SmartPhoneHashSet {
	
	private int personCount;
	private static final int MAX_PERSON_NUM = 10;
	private Scanner sc = new Scanner(System.in);
	private HashSet<Contact> user = new HashSet<Contact>();

	private boolean isInNumRange(int index) 
	{
		if(index < personCount)
			return true;
		
		return false;
	}
	
	private boolean matchPerson(String name) 
	{
		user..ShowData();
		System.out.println("������ ����� ������ �½��ϱ�?");
		System.out.println("Yes or No");
		
		if(sc.next().equalsIgnoreCase("Yes"))
			return true;
		
		return false;
	}
	
	private boolean referenceCheck(String phoneNum)
	{
		for (Contact temp : user) 
		{
			if(temp.getPhoneNumber() == phoneNum)
				return false;
		}
		
		return true;
	}
	
	private static SmartPhoneHashSet addressBook = new SmartPhoneHashSet();
	
	public static SmartPhoneHashSet getInstance()
	{
		if(addressBook == null)
			addressBook = new SmartPhoneHashSet();
			return addressBook;
	}
	
	public boolean searchPerson(String name)
	{
		if(personCount == 0)
			System.out.println("�˻� �� �����Ͱ� �����ϴ�");
		
		else
		{
			for (Contact temp : user) 
			{
				if(temp.getName().equalsIgnoreCase(name))
				{
					temp.ShowData();
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean searchPeople()
	{
		for (Contact temp : user) 
			{
				temp.ShowData();
				System.out.println("====================================================================");
				
				if()
				return true;
			}
		return false;
	}
	
	public boolean addPerson(Contact ct)
	{
		if(personCount >= MAX_PERSON_NUM)
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
					personCount++;
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
	
	public boolean deletePerson(String name)
	{
		if(personCount == 0)
			System.out.println("���� �� �ִ� �����Ͱ� �����ϴ�");
			
		else
		{
			if(matchPerson(name))
			{
				user.remove(name);
				personCount--;
				return true;
			}
			
			else
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�");
		}
		return false;
	}
	
	public boolean editPerson(int index, String name, String phoneNumber, String eMail, String address, String birth, String group)
	{

		if(personCount == 0)
			System.out.println("���� �� �� �ִ� �����Ͱ� �����ϴ�");
		
		else  
		{
			if(matchPerson(name))
			{
				user..setName(name);
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
		return personCount;
	}
}
