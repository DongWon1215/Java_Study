import java.util.Scanner;
public class SmartPhone {

	
	private int personCount;
	private Contact user[] = new Contact[10];
	private Scanner sc = new Scanner(System.in);
	
	private boolean matchPerson(int index) 
	{
		user[index].ShowInfo();
		System.out.println("선택한 사람의 정보가 맞습니까?");
		System.out.println("Yes or No");
		
		if(sc.next() == "Yes")
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
	
	public void searchPerson(String name)
	{
		for(int i = 0; i < user.length; i++)
		{
			if(user[i].getName() == name)
			{
				user[i].ShowInfo();
			}
		}
	}
	
	public void searchPeople()
	{
		for(int i = 0; i < user.length; i++)
			{
				user[i].ShowInfo();
				System.out.println("====================================================================");
			}
	}
	
	public void addPerson(int index, Contact ct)
	{
		user[index] = ct;
		personCount++;
	}
	
	public void deletePerson(int index)
	{
		if(matchPerson(index))
		{
			user[index] = null;
			personCount--;
		}
	}
	
	public void editPerson(int index)
	{
		if(matchPerson(index))
		{
			System.out.println("변경할 이름, 전화번호, 이메일, 주소, 생일, 그룹명을 순서대로 작성하세요");
			
			user[index].setName(sc.next());
			user[index].setPhoneNumber(sc.next());
			user[index].setEMail(sc.next());
			user[index].setAddress(sc.next());
			user[index].setBirth(sc.next());
			user[index].setGroup(sc.next());
		}
	}
}
