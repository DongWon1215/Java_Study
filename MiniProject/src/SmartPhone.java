import java.util.Scanner;
public class SmartPhone {

	private Contact user[] = new Contact[10];
	
	private Scanner sc = new Scanner(System.in);
	
	private void printPersonInfo(int index)
	{
		System.out.println("user name :" + user[index].getName() + "user phoneNumber :" + user[index].getPhoneNumber() + "user eMail :" + user[index].getEMail()
				+ "user address :" + user[index].getAddress() + "user birthDay :" + user[index].getBirth() + "user group :" + user[index].getGroup());
	}
	
	private void setPersonInfo(int index, String name)
	{
		user[index].setName(name);
	}
	
	private boolean matchPerson(int index) 
	{
		printPersonInfo(index);
		System.out.println("정보를 수정할 사람이 맞습니까?");
		System.out.println("Yes or No");
		
		switch(sc.next())
		{
			case "Yes":
				return true;
				
			default:
				return false;
		}
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
				printPersonInfo(i);
			}
		}
	}
	
	public void searchPeople()
	{
		for(int i = 0; i < user.length; i++)
			{
				printPersonInfo(i);
				System.out.println("====================================================================");
			}
	}
	
	public void addPerson()
	{
		
	}
	
	public void deletePerson(int index)
	{
		if(matchPerson(index))
		{
			user[index] = null;
		}
	}
	
	public void editPerson(int index)
	{
		if(matchPerson(index))
		{
			
		}
	}
}
