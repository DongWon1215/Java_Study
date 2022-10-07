
public class ThreadMain {

	//메인 스레드 실행 시점
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//스레드 생성
		MyThread thread = new MyThread();
		
		//스레드 실행
		thread.start();
		
		MyThread2 rannableThread = new MyThread2();
		
		Thread thread2 = new Thread(rannableThread);
		
		thread2.start();
		
		try {
			thread.join(); // 스레드가 종료될 때 까지 다른 스레드를 block
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 스레드가 종료될 때 까지 다른 스레드를 block
		
		SumThread st = new SumThread();
		
		
	}

}
