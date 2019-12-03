package com.sp.calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("calc.userController")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/user1/calc") // 스프링 4.3부터 가능
	// @RequestMapping(value="/user1/calc", method=RequestMethod.GET)
	public String form() {
		return "user1/write";
	}
	
	// @PostMapping("/user1/calc") // 스프링 4.3부터 가능
	@RequestMapping(value="/user1/calc", method=RequestMethod.POST)
	public String submit(User dto, Model model) {
		String s = userService.calculator(dto);
		
		model.addAttribute("result", s);
		return "user1/view";
	}
}
