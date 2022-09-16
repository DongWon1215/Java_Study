import java.util.Scanner;

public class GradeCalculator 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int iScore = sc.nextInt();
		String strGrade = "F";
		
		
		
		if(iScore > 100)
			System.out.println("잘못된 값을 입력했습니다");
		
		else if (iScore >= 90)
			{
				if(iScore >= 97)
					strGrade = "A+";
				
				else if (iScore >= 94)
					strGrade = "A";
				
				else
					strGrade = "A-";
			}

		else if (iScore >= 80)
			{
				if(iScore >= 87)
					strGrade = "B+";
				
				else if (iScore >= 84)
					strGrade = "B";
				
				else
					strGrade = "B-";
			}
		else if (iScore >= 70)
		{
			if(iScore >= 77)
				strGrade = "C+";
			
			else if (iScore >= 74)
				strGrade = "C";
			
			else
				strGrade = "C-";
		}
		
		System.out.println(strGrade);
		
		sc.close();
	}

}
