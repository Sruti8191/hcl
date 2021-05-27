package dao;
import java.io.*;
import java.sql.*;
import java.util.Properties;

public class MyConnection 
{
	private MyConnection()
	{
		
	}
	private static Connection con;
	
	public static Connection getConnection() throws Exception
	{
System.out.println("MYCONNECTION");
		Properties p = new Properties();
		p.load(new FileReader("d:\\javademos\\MyConnection.properties"));
		if(con == null)
		{
			Class.forName(p.getProperty("driverName"));
			con = DriverManager.getConnection(p.getProperty("url"), p.getProperty("name"), p.getProperty("upass"));
		}
		return con;
	}
}
