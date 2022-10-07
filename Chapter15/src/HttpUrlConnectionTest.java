import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUrlConnectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	urlStr = "https://news.naver.com/";
		try
		{
			URL	url = new URL(urlStr);
			//		HttpURLConnection 인스턴스도 URL 인스턴스의 openConnection () 메소드로 얻을 수 있음
			HttpURLConnection huc = (HttpURLConnection)url.openConnection();
			for(int i = 1; i <= 8; i ++)
				System.out.println(huc.getHeaderFieldKey(i) + " = "+ huc.getHeaderField(i));
			huc.disconnect();
			}
			catch (Exception e )
			{
				System.out.println(e);
			}
	}

}
