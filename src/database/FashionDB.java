package database;
import java.sql.*;
public class FashionDB {
	public static Connection getConnection() throws Exception
	{
		Connection con=null;
		String url="jdbc:mysql://localhost:3306";
		String dbName="fashion";
		String drivername="com.mysql.jdbc.Driver";
		String username="root";
		String pass="root";
		
		Class.forName(drivername);
		con=DriverManager.getConnection(url+dbName,username,pass);
		return con;
		}

	}

