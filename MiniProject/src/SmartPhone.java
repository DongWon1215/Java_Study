import java.util.Scanner;

public class SmartPhone {
	
	private int personCount;
	private static final int MAX_PERSON_NUM = 10;
	private Scanner sc = new Scanner(System.in);
	private Contact user[] = new Contact[MAX_PERSON_NUM];

	private boolean isInNumRange(int index) 
	{
		if(index < personCount)
			return true;
		
		return false;
	}
	
	private boolean matchPerson(int index) 
	{
		user[index].ShowInfo();
		System.out.println("선택한 사람의 정보가 맞습니까?");
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
	
	public boolean searchPerson(String name)
	{
		if(personCount == 0)
			System.out.println("검색 할 데이터가 없습니다");
		
		else
		{
			for(int i = 0; i < personCount; i++)
			{
				if(user[i].getName().equalsIgnoreCase(name))
				{
					user[i].ShowInfo();
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
				user[i].ShowInfo();
				System.out.println("====================================================================");
				
				if(i == personCount - 1)
				return true;
			}
		return false;
	}
	
	public boolean addPerson(Contact ct)
	{
		if(personCount >= MAX_PERSON_NUM)
			System.out.println("최대 인원 수에 도달하였습니다");
		
		else
		{
			user[personCount] = ct;
			personCount++;
			return true;
		}
		return false;
	}
	
	public boolean deletePerson(int index)
	{
		if(personCount == 0)
			System.out.println("지울 수 있는 데이터가 없습니다");
			
		else
		{
			if(matchPerson(index) && isInNumRange(index))
			{
				for(int i = index; i < personCount; i++)
				user[i] = user[i + 1];
				user[personCount] = null;
				personCount--;
				return true;
			}
			
			else
				System.out.println("잘못된 값을 입력하셨습니다");
		}
		return false;
	}
	
	public boolean editPerson(int index, String name, String phoneNumber, String eMail, String address, String birth, String group)
	{

		if(personCount == 0)
			System.out.println("수정 할 수 있는 데이터가 없습니다");
		
		else 
		{
			if(matchPerson(index))
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
	
	public int getAddressRealLength()
	{
		return personCount;
	}
}
