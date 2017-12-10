package nju.software.exam.service;

import nju.software.exam.entity.User;

public interface LoginService {
	public User login(String email,String password);
}
