package config;
import java.sql.*;
public class JDBCConnection {
	public static Connection getJDBConnection() throws ClassNotFoundException, SQLException{
		String url="jdbc:sqlserver://DESKTOP-R1KFKCE\\PREETHI:1433;databaseName=pcsdb;user=sa;password=preethu";
		String username="sa";
		String password="preethu";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conn=DriverManager.getConnection(url);
		
		if(conn!=null)
			System.out.println("Connected");
		else
			System.out.println("Not Connected");
		return conn;

	}
}
