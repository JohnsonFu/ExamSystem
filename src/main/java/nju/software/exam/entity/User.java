package nju.software.exam.entity;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7643579107939486993L;
	
	private Integer id;
	
	private String email;
	
	private String username;
	
	private Integer role;//0:老师  1：学生
	
	private String password;

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}



	private Integer grade;//年级

	public Integer getClaSS() {
		return claSS;
	}

	public void setClaSS(Integer claSS) {
		this.claSS = claSS;
	}

	private Integer claSS;//班级

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String toString(){
		return "email:"+email+"--名字:"+username+"--年级："+grade+"--班级:"+claSS;
	}

}
