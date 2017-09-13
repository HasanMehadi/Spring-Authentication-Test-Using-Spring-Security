package com.springmvc.springauthentication.DAO;

import java.util.List;

import com.springmvc.springauthentication.model.UserInfo;

public interface UserInfoDAO {

	 public UserInfo findUserInfo(String userName);
     
	    // [USER,AMIN,..]
	    public List<String> getUserRoles(String userName);
}
