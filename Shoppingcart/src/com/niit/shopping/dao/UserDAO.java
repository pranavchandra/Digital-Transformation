package com.niit.shopping.dao;

public class UserDAO {
	public boolean isValidCredentials(String userid,String password)
	{
		if(userid.equals("myidxyz")&& password.equals("pswdabc"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
