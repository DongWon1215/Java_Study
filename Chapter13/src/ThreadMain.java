
public class ThreadMain {

	//���� ������ ���� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//������ ����
		MyThread thread = new MyThread();
		
		//������ ����
		thread.start();
		
		MyThread2 rannableThread = new MyThread2();
		
		Thread thread2 = new Thread(rannableThread);
		
		thread2.start();
		
		try {
			thread.join(); // �����尡 ����� �� ���� �ٸ� �����带 block
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // �����尡 ����� �� ���� �ٸ� �����带 block
		
		SumThread st = new SumThread();
		
		
	}

}
