package Ver02;
import java.util.Scanner; 

class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		SmartPhone phone = SmartPhone.getInstance();
		
		
		while(true)
		{
			System.out.println("1. 추가, 2. 수정, 3. 검색, 4. 출력, 5. 제거, 0. 종료");
			switch(sc.nextInt())
			{
				case 1:
					System.out.println("이름, 전화번호, 이메일, 주소, 생일, 그룹을 순서대로 입력하시오");
					Contact user = new Contact(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next());
						if(phone.addPerson(user))
							System.out.println("데이터 추가 성공");
						
						else 
							System.out.println("데이터 추가 실패");
					break;
	
				case 2:
					System.out.println("수정할 번호, 수정할 이름, 수정할  전화번호, 수정할  이메일, 수정할  주소, 수정할  생일, 수정할  그룹을 순서대로 입력하시오");
						if(phone.editPerson(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next()))
							System.out.println("데이터 수정 성공");
						
						else 
							System.out.println("데이터 수정 취소");
					break;
	
				case 3:
					System.out.println("검색할 이름을 입력하시오");
						if(!phone.searchPerson(sc.next()))
							System.out.println("데이터 검색 실패");
					break;
				case 4:
						if(!phone.searchPeople())
							System.out.println("데이터 출력 실패");
					break;
				case 5:
					System.out.println("삭제할 데이터가 있는 번호를 입력하시오");
						if(phone.deletePerson(sc.nextInt()))
							System.out.println("데이터 삭제 성공");
						
						else 
							System.out.println("데이터 삭제 실패");
					break;
					
				case 0:
					System.out.println("프로그램을 종료합니다");
					return;
					
					default:
						System.out.println("잘못된 값을 입력하였습니다");					
			}
		}
		//sc.close();
	}
}