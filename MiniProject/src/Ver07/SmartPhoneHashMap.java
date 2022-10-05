package Ver07;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class SmartPhoneHashMap {
	
	private int personCount;
	private static final int MAX_PERSON_NUM = 10;
	private Scanner sc = new Scanner(System.in);
	private HashMap<String,Contact> user = new HashMap<>();

	private boolean isInNumRange(int index) 
	{
		if(index < personCount)
			return true;
		
		return false;
	}
	
	private boolean matchPerson(String name) 
	{
		user.get(name).ShowData();
		System.out.println("������ ����� ������ �½��ϱ�?");
		System.out.println("Yes or No");
		
		if(sc.next().equalsIgnoreCase("Yes"))
			return true;
		
		return false;
	}
	
	private boolean referenceCheck(String phoneNum)
	{
		Iterator<HashMap.Entry<String,Contact>> entry = user.entrySet().iterator();
		while(entry.hasNext())
		{
			HashMap.Entry<String, Contact> element = entry.next();

			if(element.getValue().getPhoneNumber() == phoneNum)
				return false;
		}
		
		return true;
	}
	
	private static SmartPhoneHashMap addressBook = new SmartPhoneHashMap();
	
	public static SmartPhoneHashMap getInstance()
	{
		if(addressBook == null)
			addressBook = new SmartPhoneHashMap();
			return addressBook;
	}
	
	public boolean searchPerson(String name)
	{
		if(personCount == 0)
			System.out.println("�˻� �� �����Ͱ� �����ϴ�");
		
		else
		{
			
			if(user.get(name) != null)
			{
				user.get(name).ShowData();
				return true;
			}
		}
		return false;
	}
	
	public boolean searchPeople()
	{
		for(int i = 0; i < personCount; i++)
			{
			System.out.println(" Index = " + (i + 1));
				System.out.println(user);
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
					user.put(ct.getName(),ct);
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
				user.get(name).setName(name);
				user.get(name).setPhoneNumber(phoneNumber);
				user.get(name).setEMail(eMail);
				user.get(name).setAddress(address);
				user.get(name).setBirth(birth);
				user.get(name).setGroup(group);
				
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
