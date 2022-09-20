import java.util.Scanner;

public class Vaccination 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		// ���� �⵵���� ��� �⵵�� ���� ���̸� ����
		int m_iAge = 2022 - sc.nextInt();
		
		//�ؿ� ������ �޼��带 ȣ��
		//�Ű������� int Ÿ���� �ʿ��ϱ� ������ ���̸� �Ű������� ����־���
		FluVaccination(m_iAge);
		HealthScanning(m_iAge);
		
		
	}
	
	// ���� Ŭ���� ���� �Լ��̱� ������ private�̿��� ȣ�� �� ����� ������
	// return�� ���� ���� ������ void Ÿ������ �޼��� ����(return�� ���� ����� ������ �ش� Ÿ������ �޼��� ����)
	// ���̸� �������� �Ǻ��ϱ� ������ �Ű������� int Ÿ���� �ϳ� �������
	static void FluVaccination(int Age/*�Ű�����*/)
	{
		//���̰� 15�� �̻� �̰ų� 65�� �̸��� ��� ���� ����� �ƴ�
		if(Age >= 15 && Age < 65)
			System.out.println("���� �������� ����� �ƴմϴ�.");	
		
		// �׿��� ������ ��� ����� ����
		else
			System.out.println("���� �������� ����Դϴ�.");	
	}

	// ���� Ŭ���� ���� �Լ��̱� ������ private�̿��� ȣ�� �� ����� ������
	// ��ȯ�� ���� ���� ������ void Ÿ������ �޼��� ���� (return�� ���� ����� ������ �ش� Ÿ������ �޼��� ����)
	// ���̸� �������� �Ǻ��ϱ� ������ �Ű������� int Ÿ���� �������
	static void HealthScanning(int Age)
	{
		//���̰� 20�� �̸��̰ų� ���� ���̰� Ȧ���� ��� �ǰ����� ����� �ƴ�
		if(Age < 20 || Age % 2 != 0)
		{
			System.out.println("�ǰ����� ����� �ƴմϴ�.");			
		}
			
		//���̰� 20�� �̻��̸� ¦���� ����� �� 40�� �̸��� ����� �� �˻� ��󿡼� ����
		else if(Age < 40)
		{
			System.out.println("�ǰ������� �����մϴ�.");			
		}
			
		//���� ���ǿ� ��� �������� ���� ������� �ǰ����� �� �� �˻� ���
		else
		{
			System.out.println("�ǰ����� �� �� �˻簡 �����մϴ�.");
		}
	}
}
