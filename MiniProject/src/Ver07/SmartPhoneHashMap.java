package Ver07;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class SmartPhoneHashMap {
	
	private static final int MAX_PERSON_NUM = 10;
	private Scanner sc = new Scanner(System.in);
	private HashMap<String,Contact> user = new HashMap<>();

	private boolean isInNumRange(int index) 
	{
		if(index < user.size())
			return true;
		
		return false;
	}
	
	private boolean matchPerson(String name) 
	{
		user.get(name).ShowData();
		System.out.println("선택한 사람의 정보가 맞습니까?");
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
		if(user.isEmpty())
			System.out.println("검색 할 데이터가 없습니다");
		
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
		for(int i = 0; i < user.size(); i++)
			{
			System.out.println(" Index = " + (i + 1));
				System.out.println(user);
				System.out.println("====================================================================");
				
				if(i == user.size() - 1)
				return true;
			}
		return false;
	}
	
	public boolean addPerson(Contact ct)
	{
		if(user.size() >= MAX_PERSON_NUM)
			System.out.println("최대 인원 수에 도달하였습니다");
		
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
					return true;
			}
			catch(InputMismatchException e)
			{
				System.out.println("잘못된 형식의 번호를 입력했습니다");	
			}
			catch(Exception e)
			{
				System.out.println("중복된 번호는 저장할 수 없습니다");		
			}
		}
		return false;
	}
	
	public boolean deletePerson(String name)
	{
		if(user.isEmpty())
			System.out.println("지울 수 있는 데이터가 없습니다");
			
		else
		{
			if(matchPerson(name))
			{
				user.remove(name);
				return true;
			}
			
			else
				System.out.println("잘못된 값을 입력하셨습니다");
		}
		return false;
	}
	
	public boolean editPerson(int index, String name, String phoneNumber, String eMail, String address, String birth, String group)
	{

		if(user.isEmpty())
			System.out.println("수정 할 수 있는 데이터가 없습니다");
		
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
		return user.size();
	}
}
