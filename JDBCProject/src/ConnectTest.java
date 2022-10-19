import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectTest {
	public static void main(String[] args) 
	{
		
		
			try {
				//1. 드라이버 로드( 생략 가능)
				Class.forName("oracle.jdbc.driver.OracleDriver");// 생략 가능
				
				//2. Connection 객체 생성
				String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
				//String dbUrl = "jdbc:MySql://@localhost:3306:project";
				Connection conn = DriverManager.getConnection(dbUrl, "SCOTT","tiger");
				
				if(conn != null)
				{
					System.out.println("DateBast Connection");
				}
				
				//3. Statement / PreparedStatement 객체 생성
				Statement stmt = conn.createStatement();
				
				String sql = "select * from dept";
				
				//stmt.executeUpdate(sql);

				//4. ResultSet 객체 생성
				ResultSet rs = stmt.executeQuery(sql);

				while(rs.next())
				{
//					int deptno = rs.getInt("deptno");
//					String dname = rs.getString("dname");
//					String loc = rs.getString("loc");
					int deptno = rs.getInt(1);
					String dname = rs.getString(2);
					String loc = rs.getString(3);
					
					System.out.printf("%d \t %s \t %s \n",deptno, dname, loc);
					
				}
				
				rs.close();
				stmt.close();
				conn.close();
			} 
			
			catch (ClassNotFoundException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
	
		
	}
}
