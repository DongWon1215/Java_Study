
public class SumThread extends Thread{
	public static void main(String[] args) {
		Sum sum = new Sum();
	}
}
class Sum   
{
	long num;
	synchronized void sum (long num)
	{
		this.num += num;
	}
	
	synchronized(this)	//�ش� �������� �ִ� ������ ������ �������� �����ض�
	{
		
	}
}
