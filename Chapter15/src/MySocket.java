import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MySocket {
	
	public static void main(String[] args) {
		
		try {
			//통신을 위한 Socket 필요
			ServerSocket ss = new ServerSocket(9999);
			
			System.out.println("서버 소켓이 생성 되었습니다");
			
			Socket s = ss.accept();
			
			System.out.println("연결되었습니다");
			
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
