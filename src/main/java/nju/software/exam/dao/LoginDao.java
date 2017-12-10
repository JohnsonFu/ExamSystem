package nju.software.exam.dao;

import nju.software.exam.entity.User;

public interface LoginDao {

	public User isValid(String email,String password);
}
