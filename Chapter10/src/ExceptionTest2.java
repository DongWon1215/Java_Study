import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("국어점수 >>");
			int score = sc.nextInt();
			
			try
			{
				if(!(score >= && score <= 100))
				{
					throw new Exception("잘못된 값 입력");
				}
				
				System.out.println("국어점수 : " + score);
				break;
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println("다시 입력");
			}
		}
	}

}
