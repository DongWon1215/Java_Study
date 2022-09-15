
	import java.util.Scanner;
	
public class Calculator {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
				
		double m_dPrimal, m_dSecond;
		float m_fRadius;
		
		while(true)
		{
			System.out.println("���ϴ� ����� �����ϼ���");
		
			System.out.println("1. ���� 2. ���� 3. ���� 4. ������(�� ��ȯ), 5. ������(������ ��ȯ), 6. ���� ���� ���, 7. ���� �ѷ� ���, etc. ����");
			switch(scan.nextInt())
			{
			case 1:
				System.out.println("���� ù��° ���ڸ� �Է��ϼ���");
				m_dPrimal = scan.nextDouble();
			
				System.out.println("���� �ι�° ���ڸ� �Է��ϼ���");
				m_dSecond = scan.nextDouble();
			
				System.out.println("����� : " + Add(m_dPrimal,m_dSecond));
			
				break;
			case 2:
				System.out.println("�� ù��° ���ڸ� �Է��ϼ���");
				m_dPrimal = scan.nextDouble();
			
				System.out.println("�� �ι�° ���ڸ� �Է��ϼ���");
				m_dSecond = scan.nextDouble();
			
				System.out.println("����� : " + Sub(m_dPrimal,m_dSecond));
			
				break;
			case 3:
				System.out.println("���� ù��° ���ڸ� �Է��ϼ���");
				m_dPrimal = scan.nextDouble();
			
				System.out.println("���� �ι�° ���ڸ� �Է��ϼ���");
				m_dSecond = scan.nextDouble();
			
				System.out.println("����� : " + Mul(m_dPrimal,m_dSecond));
			
				break;
			case 4:
				System.out.println("���� ù��° ���ڸ� �Է��ϼ���");
				m_dPrimal = scan.nextDouble();
			
				System.out.println("���� �ι�° ���ڸ� �Է��ϼ���");
				m_dSecond = scan.nextDouble();
			
				System.out.println("����� : " + Div(m_dPrimal,m_dSecond));
			
				break;
			case 5:
				System.out.println("���� ù��° ���ڸ� �Է��ϼ���");
				m_dPrimal = scan.nextDouble();
			
				System.out.println("���� �ι�° ���ڸ� �Է��ϼ���");
				m_dSecond = scan.nextDouble();
			
				System.out.println("����� : " + Rem(m_dPrimal,m_dSecond));
			
				break;
			case 6:
				System.out.println("���� �������� �Է��ϼ���");
				m_fRadius = scan.nextFloat();
			
				System.out.println("����� : " + CalRadian(m_fRadius));
			
				break;
			case 7:
				System.out.println("���� �������� �Է��ϼ���");
				m_fRadius = scan.nextFloat();
			
				System.out.println("����� : " + CalRound(m_fRadius));
			
				break;

			default:
				System.out.println("���� ����");
				return;
			}
		}
	}
	
	static double Add(double primary, double secondary)
	{
		return primary + secondary;
	}
	
	static double Sub(double primary, double secondary)
	{
		return primary - secondary;
	}
	
	static double Mul(double primary, double secondary)
	{
		return primary * secondary;
	}
	
	static double Div(double primary, double secondary)
	{
		return primary / secondary;
	}
	
	static double Rem(double primary, double secondary)
	{
		return primary % secondary;
	}
	
	static double CalRadian(float Radius)
	{
		return Radius * Radius * Math.PI;
	}
	
	static double CalRound(float Radius)
	{
		return Radius * 2 * Math.PI;
	}
	
}
