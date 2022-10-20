package dept;

import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Command command = new Command();
		
		
		while(true)
		{
			menu();
			System.out.println("메뉴를 입력하시오");
			int select = Integer.parseInt(sc.nextLine());
			
			//list.get(select).process();
			command.command.get(select).process();
		}
		
	}
	
	public static void menu()
	{
		System.out.println("부서 관리 프로그램");
		
		System.out.println("1. 전체 부서 리스트");
		System.out.println("2. 부서 검색");
		System.out.println("3. 부서 정보 저장");
		System.out.println("4. 부서 정보 수정");
		System.out.println("5. 부서 정보 삭제");
		System.out.println("6. 프로그램 종료");
	}
	
}
