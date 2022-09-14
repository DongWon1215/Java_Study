package P1;

import java.util.Scanner;

class Human
{
	String m_sName = null;
	int m_iAge = 0;
	double m_dHeight = 0;
	boolean m_isHasBook = false;
}

public class S2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		SetParameter(s.nextLine(),s.nextInt(),s.nextDouble(),s.nextBoolean());
		
		s.close();
	}
	
	static void SetParameter(String name, int age, double height, boolean hasbook)
	{
		Human h = new Human();
		
		h.m_sName = name;
		h.m_iAge = age;
		h.m_dHeight = height;
		h.m_isHasBook = hasbook;
		
		System.out.println("my name is " + h.m_sName);
		System.out.println("my age is " + h.m_iAge);
		System.out.println("my height is " + h.m_dHeight);
		System.out.println("fact : " + h.m_isHasBook);
	}
}


