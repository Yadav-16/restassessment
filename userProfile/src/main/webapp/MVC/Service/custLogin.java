package com.example.training;

import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.annotation.Autowired;

@Service
@Scope("prototype")

public class custLogin {
	@Autowired 
	userRepository ur;
		
	}
	
public boolean register(String uid, String pwd, String name1,  String name2, String GID1,   String GID2,String GID3, String email,String Phn,String DOB){
	System.out.println("in service");
	UsersEntity ue=new UsersEntity();
	ue.setUid(uid);
	ue.setPwd(pwd);
	ue.setfname(name1);
	ue.setlname(name2);
	ue.setGID1(GID1);
	ue.setGID2(GID2);
	ue.setGID3(GID3);
	ue.setemail(email);
	ue.setPhn(Phn);
	ue.setDOB(DOB);
	ur.save(ue);
	return true;
}
	public boolean changePwd(String uid, String Pwd) {
	System.out.println("in service");
		UsersEntity ue=new UsersEntity();
		ue.setUid(uid);
		ue.setPwd(pwd);
		ur.save(ue);
		return true;
	}
	
	public boolean loginCheck(String uid, String pwd) {
		System.out.println("in service");
		int rest=ur.checkUidPwd(uid, pwd);
		if(rest>0)
			return true;
		else
			return false;
	}
	
	public boolean upProf(String uid,String pwd, String Dob) {
		UsersEntity ue=new UsersEntity();
		ue.setUid(uid);
		ue.setPwd(pwd);
		ue.setdob(Dob);
		ur.save(ue);
		return true;
}
	public boolean delete(String uid) {
		UsersEntity ue=new UsersEntity();
		ue.setUid(uid);
		ur.delete(ue);
		return true;
	}
}

