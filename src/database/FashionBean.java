package database;

import java.io.Serializable;
import one.cart;

public class FashionBean implements Serializable  {
	
	private String username;
	private String fname;
	private String lname;
	private String sex;
	private String Add;
	private int mob;
	private String email;
	/*public int jeans;
	public int tshirt;
	public int dress;
	public int shoes;*/
	public int amt;

	//int amt=cart.s;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAdd() {
		return Add;
	}
	public void setAdd(String add) {
		Add = add;
	}
	public int getMob() {
		return mob;
	}
	public void setMob(int mob) {
		this.mob = mob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/*public int getJeans() {
		return jeans;
	}
	public void setJeans(int jeans) {
		this.jeans = jeans;
	}
	public int getTshirt() {
		return tshirt;
	}
	public void setTshirt(int tshirt) {
		this.tshirt = tshirt;
	}
	public int getDress() {
		return dress;
	}
	public void setDress(int dress) {
		this.dress = dress;
	}
	public int getShoes() {
		return shoes;
	}
	public void setShoes(int shoes) {
		this.shoes = shoes;
	}*/
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	
}
