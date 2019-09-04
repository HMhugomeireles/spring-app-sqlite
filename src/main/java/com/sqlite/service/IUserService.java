package com.sqlite.service;

import com.sqlite.entities.UserLogin;
import com.sqlite.models.LoginModel;
import com.sqlite.models.UserLoginModel;

import java.util.List;


public interface IUserService {

    public List<UserLogin> getAllUsers();
	
	public void save(UserLogin person);
    
    public UserLoginModel getUser(LoginModel loginModel);
}
