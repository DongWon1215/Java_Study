import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("�������� >>");
			int score = sc.nextInt();
			
			try
			{
				if(!(score >= && score <= 100))
				{
					throw new Exception("�߸��� �� �Է�");
				}
				
				System.out.println("�������� : " + score);
				break;
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println("�ٽ� �Է�");
			}
		}
	}

}
