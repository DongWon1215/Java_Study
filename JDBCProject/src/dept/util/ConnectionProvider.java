package dept.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	//Connection ��ü�� �����ؼ� �������ִ� �޼ҵ�
	
	public static Connection getConnection() throws SQLException
	{
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(dbUrl, "SCOTT","tiger");
		
		return conn;
	}
}
