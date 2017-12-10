package nju.software.exam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nju.software.exam.dao.LoginDao;
import nju.software.exam.entity.User;
import nju.software.exam.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDao loginDao;

	@Override
	public User login(String email, String password) {
		// TODO Auto-generated method stub
		return loginDao.isValid(email, password);
	}
	
	
	
}
