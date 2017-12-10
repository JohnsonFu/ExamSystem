package nju.software.exam.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import nju.software.exam.entity.User;
import nju.software.exam.service.LoginService;

@Controller
public class MainController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
    public String getLoginPage() {		
        return "login";
    }
	
	@RequestMapping(value="/",method=RequestMethod.POST)
    public String doLogin(HttpServletRequest request , HttpSession session) {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		User user = loginService.login(email, password);
		
		if (user==null) {
			return "redirect:/login";
		}
		else {
			session.setAttribute("name", user.getUsername());
			int role = user.getRole();
			if (role==0) {
				return "/teacher/index";
			}
			else {
				return "/teacher/index";
			}
		}       
    }
	
	@RequestMapping("/question")
    public String question() {		
        return "question";
    }
	
	@RequestMapping("/exam")
    public String exam() {		
        return "teacher_header";
    }
}
