package nju.software.exam.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping(value="/index",method = RequestMethod.GET)
    public String getTeacherIndexPage(Model model,HttpSession session) {
		String name = (String) session.getAttribute("name");
		model.addAttribute("name", name);
		return "student_index";
    }	
	
	@RequestMapping(value="/exam",method = RequestMethod.GET)
    public String getExamSettingPage(Model model,HttpSession session) {		
		String name = (String) session.getAttribute("name");
		model.addAttribute("name", name);
        return "student_header";
    }
	
}
