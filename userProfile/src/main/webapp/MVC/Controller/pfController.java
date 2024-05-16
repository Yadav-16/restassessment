package com.example.training;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Scope("prototype")

public class pfController {
	@Autowired
	custLogin Cl;
		
	
	// this controller does not know how to register or do any other action
		// it depends on custLogin to help with register
				//DEPENDANCY//
	//spring framework will create object for you
	// NEVER EVER create/initialize "new"
	// autowired can be used only on programs that
	// are special spring framwork program
	
	@RequestMapping ("/Registration")
	public String reg(@RequestParam String uid, @RequestParam String pwd, @RequestParam String name1,  @RequestParam String name2, @RequestParam String GID1,  @RequestParam String GID2,@RequestParam String GID3,@RequestParam String email,@RequestParam String Phn,@RequestParam String DOB) {
		System.out.print("In Controller");
		bolean res=Cl.register(uid,pwd, name1,name2,GID1, GID2, GID3, email, Phn, DOB);
		
		
		System.out.print("Back in Controller");
		if (res=true)
			return "success";
		else 
			return"failure";
	}
	
	@RequestMapping("/AUTH")
	public String auth (@RequestParam String uid, @RequestParam String pwd) {
			System.out.print("In controller");
		boolean rest= Cl.logincheck(uid,pwd); 
		if (rest=true)
			return "Login Succesful";
		else 
			return "Sorry, login unsucessful. Please try again";
	}

	@RequestMapping ("/change_password")
	public String chP (@RequestParam String uid, @RequestParam String pwd) {
		System.out.println("in controller");
		boolean res=Cl.changePwd(uid, pwd);
		System.out.println("back in controller");
		return "/View/Success.jsp";
	}
	 
	////////////////////////////////////////////////////////////////////////////////
	
	
	@RequestMapping ("/update_profile")	
	public String udP (@RequestParam String uid, @RequestParam String pwd, @RequestParam String Dob {
		System.out.println("in controller");
		boolean res= Cl.upProf(userid, password, Dob); 
		System.out.println("back in controller"); 
		return "success";	
		
	}


/*	@RequestMapping("/delete")
		public String del(@RequestParam String uid) {
			boolean res=Cl.delete(uid);
			return "success";
		}
	*/
	
	
	/*
	http://localhost<prefix>return string<suffix>	
	http://localhost/view/success.jsp	
	*/
		
		// http://ipaddress:port/success
		//http://ipaddress:port/<prefix><return><suffix>
		//http://ipaddress:port/jsp/welcome.jsp
	
		
	}
