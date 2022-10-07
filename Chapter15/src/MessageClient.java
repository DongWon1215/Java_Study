import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MessageClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket;
		try {
			socket = new Socket("localhost", 7777);
			
			DataInputStream din = new DataInputStream(socket.getInputStream());
			DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
			
			Scanner sc = new Scanner(System.in);
			
			String str1 = "";
			String str2 = "";
			
			
			while(true)
			{
				
				str1 = sc.nextLine();
				dout.writeUTF(str1);
				dout.flush();
				
				if(str1.equals("exit"))
					break;
				
				str2 = din.readUTF();
				System.out.println("Server : " + str2);
			}
			
			dout.close();
			din.close();
			socket.close();
			
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
