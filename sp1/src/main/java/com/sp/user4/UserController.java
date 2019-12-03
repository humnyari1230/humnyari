package com.sp.user4;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("user4.userController")
public class UserController {
	
	@RequestMapping(value="/user4/write", method=RequestMethod.GET)
	public String form() {
		return "user4/write";
	}
	
	@RequestMapping(value="/user4/write", method=RequestMethod.POST)
	public String submit(HttpServletRequest req) {
		// 파라미터를 HttpServletRequest로 받기
		
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		
		String s = "이름 : "+name+"<br>";
		s+="나이 : "+age;
		
		
		req.setAttribute("result", s);
		
		return "user4/view";
	}
}
