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
		for (int i = 0; i < personCount; i++) 
		{
			if(user..getPhoneNumber() == phoneNum)
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
			for(int i = 0; i < personCount; i++)
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
		for(int i = 0; i < personCount; i++)
			{
			System.out.println(" Index = " + (i + 1));
				user.get(i).ShowData();
				System.out.println("====================================================================");
				
				if(i == personCount - 1)
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
	
	public boolean deletePerson(int index)
	{
		if(personCount == 0)
			System.out.println("���� �� �ִ� �����Ͱ� �����ϴ�");
			
		else
		{
			if(matchPerson(index) && isInNumRange(index))
			{
				for(int i = index; i < personCount - 1; i++)
				user.set(i,user.get(i + 1));
				user.remove(personCount);
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
		return personCount;
	}
}
