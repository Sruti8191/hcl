package dao;
import model.*;
import java.util.*;
import java.sql.*;

public class UserDao 
{
	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;
	private String sql;
	
	public UserDao() throws Exception
	{
		con = MyConnection.getConnection();
System.out.println("DaoClass");
	}
	
	public String validate(User user) throws Exception
	{
		sql = "select * from login where userName = ? and userPassword = ?";
		pst = con.prepareStatement(sql);
		pst.setString(1, user.getUserName());
		pst.setString(2, user.getUserPassword());
		rs = pst.executeQuery();
		if(rs.next()==true)
		{
			return "welcome.jsp";
		}
		else
		{
		    return "error.jsp";
		}
	}
}
