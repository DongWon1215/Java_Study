
public class MyThread extends Thread{
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 100; i++) 
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	//�����带 �Ͻ������� block ���·� ����
			System.out.println("������ ����");
		}
	}


}