package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import database.FashionBean;
//import database.FashionBean;


 class FashionDAO {
	
	static int addfash(FashionBean bean)
	{
		Connection con = null;
		PreparedStatement p= null;
		 try
		  {
			 
			  con=FashionDB.getConnection();
			  String str = "Insert into fashion1 values (?,?,?,?,?,?)";
			  p = con.prepareStatement(str);
			  
			  p.setString(3,bean.getUsername());
			  p.setString(1,bean.getFname());
			  p.setString(2,bean.getLname());
			  p.setString(4,bean.getEmail());
			  p.setInt(5,bean.getMob());
			  p.setString(6,bean.getAdd());
			//  p.setInt(7,bean.getAmt());
			 // p.setString(8,bean.getSex());
			/*  p.setInt(7,bean.getTshirt());
			  p.setInt(8,bean.getJeans());
			  p.setInt(9,bean.getDress());
			  p.setInt(10,bean.getShoes()); */
			  			  
			  
			  int updateCount = p.executeUpdate(); 
			  return updateCount; 
			}
		 catch(Exception ex)
		 {
		 System.out.println(ex.toString());
		 return 0;
		 }
		 }
	
	public static int total(int a)
	{
		Connection con=null;
		
		try {
				con=FashionDB.getConnection();
				String sql="UPDATE fashion1 set amt=?";
				PreparedStatement p=con.prepareStatement(sql);
				p.setInt(7, a);
				int updateCount=p.executeUpdate();
				return updateCount;
			}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
			return 0;
		}
 	}
	
	
	
	
}

























