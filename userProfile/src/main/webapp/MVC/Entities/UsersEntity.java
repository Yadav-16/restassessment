package com.example.training;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class UsersEntity {
	@Id
	@Column(name="UserId")
	String uid;	
	@Column(name="Firstname")
	String name1;
	@Column(name="Lastname")
	String name2;
	@Column(name="password")
	String pwd;
	@Column(name="Gender")
	String GID1;
	String GID2;
	String GID3;
	@Column(name="email")
	String email;
	@Column(name="Phone")
	String Phn;
	@Column(name="DOB")
	String DOB;
	
	// uid is unique key in the table, need at least a constructor with uid only.
	public UsersEntity(String uid,String pwd )
	{
		this.uid=uid;
		this.pwd=pwd;
	}
	
	public UsersEntity(String uid)
	{
		this.uid=uid;
	}
	public UsersEntity()
	{
	}
	
	//Get and Set parameters//
	
	public String getUserid() {
		return uid;
	}
	public void setUserid(String uid) {
		this.uid = uid;
	}
	
	public String getFirstName() {
		return name1;
	}
	public void setFirstName(String name1) {
		this.name1 = name1;
	}
	public String getLastName() {
		return name2;
	}
	public void setLastName(String name2) {
		this.name2 = name2;
	}
	public String getPassword() {
		return pwd;
	}
	public void setPassword(String pwd) {
		this.pwd = pwd;
	}
	
	//////////////GENDER GETTERS AND SETTERS///////
	
	public String getGender1() {
		return GID1;
	}
	public void setGender1(String GID1) {
		this.GID1 = GID1;
	}
	
	
	public String getGender2() {
		return GID2;
	}
	public void setGender2(String GID2) {
		this.GID2 = GID2;
	}
	
	
	public String getGender3() {
		return GID3;
	}
	public void setGender3(String GID3) {
		this.GID3 = GID3;
	}
	//////////////////////////////////////////
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
		}
	public String getPhone() {
		return Phn;
	}
	public void setPhone(String Phn) {
		this.Phn = Phn;
		}


}
