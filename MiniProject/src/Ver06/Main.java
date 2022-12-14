package Ver06;
import java.util.InputMismatchException;
import java.util.Scanner; 

public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		SmartPhone phone = SmartPhone.getInstance();
		while(true)
		{
			System.out.println("1. 연락처 추가 ,2. 회사 정보 추가, 3. 고객 정보 추가, 4. 수정 5. 검색, 6. 출력, 7. 제거, 0. 종료");
			try
			{
				switch(sc.nextInt())
				{
					case 1:
						System.out.println("이름, 전화번호, 이메일, 주소, 생일, 그룹을 순서대로 입력하시오");
						Contact user = new Contact(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next());
						if(phone.addPerson(user))
							System.out.println("주소록 추가 성공");
					
						else 
							System.out.println("주소록 추가 실패");
						break;
				
					case 2:
						System.out.println("이름, 전화번호, 이메일, 주소, 생일, 그룹, 회사명, 부서명, 직급을 순서대로 입력하시오");
						Contact company = new CompanyContact(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next());
							if(phone.addPerson(company))
								System.out.println("주소록 추가 성공");
						
							else 
								System.out.println("주소록 추가 실패");
							break;
	
					case 3:
						System.out.println("이름, 전화번호, 이메일, 주소, 생일, 그룹, 거래처명, 부서명, 직급 을 순서대로 입력하시오");
						Contact customer = new CustomerContact(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next());
							if(phone.addPerson(customer))
								System.out.println("주소록 추가 성공");
						
							else 
								System.out.println("주소록 추가 실패");
							break;
					
					case 4:
						System.out.println("수정할 번호, 수정할 이름, 수정할  전화번호, 수정할  이메일, 수정할  주소, 수정할  생일, 수정할  그룹을 순서대로 입력하시오");
							if(phone.editPerson(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next()))
								System.out.println("주소록 수정 성공");
						
							else 
								System.out.println("주소록 수정 취소");
							break;
	
					case 5:
						System.out.println("검색할 이름을 입력하시오");
							if(!phone.searchPerson(sc.next()))
								System.out.println("주소록 검색 실패");
							break;
					case 6:
							if(!phone.searchPeople())
								System.out.println("주소록 출력 실패");
							break;
					case 7:
						System.out.println("삭제할 데이터가 있는 번호를 입력하시오");
							if(phone.deletePerson(sc.nextInt()))
								System.out.println("주소록 삭제 성공");
						
							else 
								System.out.println("주소록 삭제 실패");
							break;
					
					case 0:
						System.out.println("프로그램을 종료합니다");
						return;
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("잘못된 값을 입력하였습니다");		
			}
		}
		//sc.close();
	}
}