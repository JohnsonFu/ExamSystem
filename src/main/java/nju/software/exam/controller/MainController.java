package nju.software.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
    public String login() {		
        return "login";
    }
	
	@RequestMapping("/index")
    public String index() {		
        return "index";
    }
	
	@RequestMapping("/question")
    public String question() {		
        return "header";
    }
}
