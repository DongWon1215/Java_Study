import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class InetAddressTest {
	public static void main(String[] args) {
		
		String hostname = "naver.com";
		String urlStr = "https://support.microsoft.com/ko-kr/windows/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%A8%EC%9D%B4-%EC%84%A4%EC%B9%98-%EB%98%90%EB%8A%94-%EC%A0%9C%EA%B1%B0%EB%90%98%EC%A7%80-%EC%95%8A%EB%8F%84%EB%A1%9D-%ED%95%98%EB%8A%94-%EB%AC%B8%EC%A0%9C-%ED%95%B4%EA%B2%B0-cca7d1b6-65a9-3d98-426b-e9f927e1eb4d";
				
		try {
			InetAddress ip = InetAddress.getByName(hostname);
			URL url = new URL(urlStr);
			URLConnection connection = url.openConnection();
			
			InputStream in = connection.getInputStream();
			
			while(true)
			{
				int data = in.read();
				
				if(data == -1)
					break;
				
				System.out.print((char)data);
			}
			
			System.out.println(ip.getHostAddress());
			System.out.println(ip.getHostName());
			System.out.println(url.getProtocol());
			System.out.println(url.getPort());
			System.out.println(url.getHost());
			System.out.println(url.getDefaultPort());
			System.out.println(url.getQuery());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
