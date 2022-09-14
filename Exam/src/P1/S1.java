package P1;

public class S1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Printmyname();

		int m_iFir = 10, m_iSec = 20;
		
		System.out.println(Add(m_iFir,m_iSec));
		System.out.println(Sub(m_iFir,m_iSec));
		System.out.println(Mul(m_iFir,m_iSec));
		System.out.println(Div(m_iSec,m_iFir));
		System.out.println(Rem(m_iFir,m_iSec));
	}
	static void Printmyname()
	{
		String m_sName = "kang dong won";
		System.out.println("My name is : " + m_sName);
				
	}
	static long Add(long a, long b)
	{
		return a+b;
	}
	static long Sub(long a, long b)
	{
		return a-b;
	}
	static long Mul(long a, long b)
	{
		return a*b;
	}
	static double Div(double a, double b)
	{
		return a/b;
	}
	static double Rem(double a, double b)
	{
		return a%b;
	}
}
