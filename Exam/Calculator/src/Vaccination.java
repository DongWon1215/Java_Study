import java.util.Scanner;

public class Vaccination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		
		int m_iAge = 2022 - sc.nextInt();
		
		FluVaccination(m_iAge);
		HealthScanning(m_iAge);
		
		
	}
	
	static void FluVaccination(int Age)
	{
		
		if(Age >= 15 && Age < 65)
			System.out.println("���� �������� ����� �ƴմϴ�.");	
		
		else
			System.out.println("���� �������� ����Դϴ�.");	
	}
	
	static void HealthScanning(int Age)
	{
		if(Age < 20 || Age % 2 != 0)
		{
			System.out.println("�ǰ����� ����� �ƴմϴ�.");			
		}
			
		else if(Age < 40)
		{
			System.out.println("�ǰ������� �����մϴ�.");			
		}
			
		else
		{
			System.out.println("�ǰ����� �� �� �˻簡 �����մϴ�.");
		}
	}
}
