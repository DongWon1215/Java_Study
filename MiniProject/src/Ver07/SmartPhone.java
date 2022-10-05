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
		System.out.println("선택한 사람의 정보가 맞습니까?");
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
			System.out.println("검색 할 데이터가 없습니다");
		
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
					user.add(ct);
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
	
	public boolean deletePerson(int index)
	{
		if(user.isEmpty())
			System.out.println("지울 수 있는 데이터가 없습니다");
			
		else
		{
			if(matchPerson(index) && isInNumRange(index))
			{
				user.remove(index);
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
