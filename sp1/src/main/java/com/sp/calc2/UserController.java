package com.sp.calc2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("calc2.userController")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user2/calc", method=RequestMethod.GET)
	public String form() {
		return "user2/write";
	}

	@RequestMapping(value="/user2/calc", method=RequestMethod.POST)
	public String submit(int num1, String operator, int num2, Model model) {
		String s = userService.calculator(num1, operator, num2);
		
		model.addAttribute("result", s);
		return "user2/view";
	}
}
