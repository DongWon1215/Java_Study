
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
	
	synchronized(this)	//해당 스코프에 있는 내용을 제외한 나머지는 진행해라
	{
		
	}
}
