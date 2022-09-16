import java.util.Scanner;

public class Vaccination 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		// 현재 년도에서 출생 년도를 빼서 나이를 구함
		int m_iAge = 2022 - sc.nextInt();
		
		//밑에 생성한 메서드를 호출
		//매개변수로 int 타입이 필요하기 때문에 나이를 매개변수로 집어넣어줌
		FluVaccination(m_iAge);
		HealthScanning(m_iAge);
		
		
	}
	
	// 같은 클래스 내의 함수이기 때문에 private이여도 호출 및 사용이 가능함
	// return할 값이 없기 때문에 void 타입으로 메서드 생성(return할 값을 만들고 싶으면 해당 타입으로 메서드 생성)
	// 나이를 기준으로 판별하기 때문에 매개변수로 int 타입을 하나 집어넣음
	static void FluVaccination(int Age/*매개변수*/)
	{
		//나이가 15세 이상 이거나 65세 미만일 경우 접종 대상이 아님
		if(Age >= 15 && Age < 65)
			System.out.println("무료 예방접종 대상이 아닙니다.");	
		
		// 그외의 조건일 경우 대상이 맞음
		else
			System.out.println("무료 예방접종 대상입니다.");	
	}

	// 같은 클래스 내의 함수이기 때문에 private이여도 호출 및 사용이 가능함
	// 반환할 값이 없기 때문에 void 타입으로 메서드 생성 (return할 값을 만들고 싶으면 해당 타입으로 메서드 생성)
	// 나이를 기준으로 판별하기 때문에 매개변수로 int 타입을 집어넣음
	static void HealthScanning(int Age)
	{
		//나이가 20세 미만이거나 현재 나이가 홀수인 경우 건강검진 대상이 아님
		if(Age < 20 || Age % 2 != 0)
		{
			System.out.println("건강검진 대상이 아닙니다.");			
		}
			
		//나이가 20세 이상이며 짝수인 사람들 중 40세 미만인 사람은 암 검사 대상에서 제외
		else if(Age < 40)
		{
			System.out.println("건강검진이 가능합니다.");			
		}
			
		//위의 조건에 모두 충족하지 않은 사람들은 건강검진 및 암 검사 대상
		else
		{
			System.out.println("건강검진 및 암 검사가 가능합니다.");
		}
	}
}
