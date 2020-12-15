package database;

import database.FashionBean;
import database.FashionDB;
import database.FashionDAO;
import one.cart;


public class FashionService {
	FashionBean bean=new FashionBean();
	FashionDAO dao=new FashionDAO();
	
	
	/*public int checkUser(String id,String pwd)
	{
		if(id=="name" && pwd=="123")
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}*/
	
	public int acc(String Fname,String Lname,String Username,String Email,int Mob,String Add,int amt)
	{
		amt=cart.s;
		
		bean.setFname(Fname);
		bean.setLname(Lname);
		bean.setUsername(Username);
		bean.setEmail(Email);
		bean.setMob(Mob);
		bean.setAdd(Add);
		//bean.setAmt(amt);


	    int updateResult = 0;
		 try
		 {
			 updateResult = FashionDAO.addfash(bean);
			 return updateResult;
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex.toString());
			 return 0;
		 }
	    
	}
	
	public int total(int price)
	{
		int amt=bean.getAmt();
		System.out.println("Bankbean value"+amt);
		
		amt=amt+price;
		System.out.println(amt);
		
		bean.setAmt(amt);
		System.out.println("Banbean value2"+amt);
		
		 int updateResult = 0;
		 try
		 {
			 updateResult = FashionDAO.total(amt); 
			 return updateResult; 
		 }
		 catch(Exception ex)
		 {	
			 System.out.println(ex.toString());
			 return 0;
		 }
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
