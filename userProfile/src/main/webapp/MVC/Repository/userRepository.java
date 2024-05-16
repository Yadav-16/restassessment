package com.example.training;



@Repository

public class userRepository extends JPARepository<UsersEntity, String>{

	@Query (valu=SELECT count(1) FROM Users WHERE UserId=?1 and password=?2,nativequery=true)
	public int checkUidPwd(String uid,String pwd);
	
	
	
	
	
}
