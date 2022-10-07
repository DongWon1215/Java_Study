import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try 
		{
			Socket	s = new Socket("localhost", 9999);
			
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			
			dout.writeUTF("Test Message");
			dout.flush();
			
			dout.close();
			s.close();
			
		} 
		catch (UnknownHostException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
