import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MySocket {
	
	public static void main(String[] args) {
		
		try {
			//����� ���� Socket �ʿ�
			ServerSocket ss = new ServerSocket(9999);
			
			System.out.println("���� ������ ���� �Ǿ����ϴ�");
			
			Socket s = ss.accept();
			
			System.out.println("����Ǿ����ϴ�");
			
			DataInputStream din = new DataInputStream(s.getInputStream());
			
			String str = din.readUTF();
			
			System.out.println("Client : " + str);
			
			din.close();
			s.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
