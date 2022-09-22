package Ver02;
import java.util.Scanner;

class SmartPhone {
	
	private int personCount;									// 배열에 들어가있는 실질적 갯수를 저장할 변수
	private static final int MAX_PERSON_NUM = 10;				// 나중에 최대 갯수가 변경될 경우 수정이 간단하도록 최대값을 정의함
	private Scanner sc = new Scanner(System.in);				// 확인 여부 확인용 스캐너
	private Contact user[] = new Contact[MAX_PERSON_NUM];

	private boolean isInNumRange(int index) 					// 저장된 데이터 갯수보다 더 높은 숫자를 입력했는지 확인
	{
		if(index < personCount)
			return true;
		
		return false;
	}
	
	private boolean isThisPerson(int index) 					// 선택한 사람이 맞는지 확인
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
	
	public boolean searchPerson(String name)					// 입력한 이름과 동일한 이름을 가진 객체가 있는지 확인
	{
		if(personCount == 0)
			System.out.println("검색 할 데이터가 없습니다");
		
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
	
	public boolean searchPeople()								// 저장된 모든 객체 출력
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
	
	public boolean addPerson(Contact ct)						// 객체를 배열에 추가
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
	
	public boolean deletePerson(int index)						// 배열에 저장된 객체 검색 후 삭제
	{
		if(personCount == 0)
			System.out.println("지울 수 있는 데이터가 없습니다");
			
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
				System.out.println("잘못된 값을 입력하셨습니다");
		}
		return false;
	}
	
	public boolean editPerson(int index, String name, String phoneNumber, String eMail, String address, String birth, String group)		//배열에 저장된 객체의 정보를 수정
	{

		if(personCount == 0)
			System.out.println("수정 할 수 있는 데이터가 없습니다");
		
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
