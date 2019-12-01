package com.ftwitter.demo;

import javax.servlet.http.HttpSession; 

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping; 


@Controller
public class MainController {
	
	@GetMapping(value="/main")

	public String getMain(Model model, HttpSession session) {
		model.addAttribute("userName", session.getAttribute("userName")); 
		// TODO Auto-generated method stub
		
		return "main";

	}

}
