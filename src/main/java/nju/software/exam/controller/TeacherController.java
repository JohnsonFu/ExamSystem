package nju.software.exam.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

	@RequestMapping(value="/index",method = RequestMethod.GET)
    public String getTeacherIndexPage(Model model,HttpSession session) {
		String name = (String) session.getAttribute("name");
		model.addAttribute("name", name);
		return "index";
    }
	
	@RequestMapping(value="/question",method = RequestMethod.GET)
    public String getQuestionPage(Model model,HttpSession session) {
		String name = (String) session.getAttribute("name");
		model.addAttribute("name", name);
        return "question";
    }
	
//	@RequestMapping(value="/question",method = RequestMethod.POST)
//    public Map<String, String> upload_ques(@ModelAttribute MultipartFile myfile,HttpServletRequest request) {
//		Map<String, String> map = new HashMap<>();
//		String fileName=myfile.getOriginalFilename();
//		File file=new File(request.getServletContext().getContextPath(),fileName);
//		String filePath=file.getAbsolutePath();
//		System.out.println(fileName);
//		System.out.println(filePath);
//		map.put("fileName", fileName);
//		map.put("filePath", filePath);		
//        return map;
//    }
	
	@RequestMapping(value="/exam",method = RequestMethod.GET)
    public String getExamSettingPage(Model model,HttpSession session) {		
		String name = (String) session.getAttribute("name");
		model.addAttribute("name", name);
        return "teacher_header";
    }
	
	@RequestMapping(value="/score",method = RequestMethod.GET)
    public String getScorePage(Model model,HttpSession session) {		
		String name = (String) session.getAttribute("name");
		model.addAttribute("name", name);
        return "teacher_header";
    }
}
