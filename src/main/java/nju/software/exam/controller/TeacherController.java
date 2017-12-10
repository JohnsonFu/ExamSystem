package nju.software.exam.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

	@RequestMapping(value="/index",method = RequestMethod.GET)
    public String getTeacherIndexPage(Model model,HttpSession session) {
		String name = (String) session.getAttribute("name");
		model.addAttribute("name", name);
		return "index";
    }
	
	@RequestMapping("/question")
    public String getQuestionPage(Model model,HttpSession session) {
		String name = (String) session.getAttribute("name");
		model.addAttribute("name", name);
        return "question";
    }
	
	@RequestMapping("/exam")
    public String getExamSettingPage(Model model,HttpSession session) {		
		String name = (String) session.getAttribute("name");
		model.addAttribute("name", name);
        return "teacher_header";
    }
	
	@RequestMapping("/score")
    public String getScorePage(Model model,HttpSession session) {		
		String name = (String) session.getAttribute("name");
		model.addAttribute("name", name);
        return "teacher_header";
    }
}
