package nju.software.exam.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
    public Map<String, String> doLogin(HttpServletRequest request , Model model, HttpSession session) {
		Map<String, String> map = new HashMap<>();
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		User user = loginService.login(email, password);
		if (user==null) {
			map.put("path", "/");
			return map;
		}
		else {			
			session.setAttribute("name", user.getUsername());
			int role = user.getRole();
			if (role==0) {
				map.put("path", "teacher/index");
				return map;
			}
			else {
				map.put("path", "teacher/index");
				return map;
			}
		}       
    }
	
}
