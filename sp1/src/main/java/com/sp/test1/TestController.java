package com.sp.test1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("test1.testController")
@RequestMapping("/test1/*")
public class TestController {
	
	// GET 방식
	@RequestMapping(value="main", method=RequestMethod.GET)
	public String execute() {
		return "test1/main";
	}
	
	// POST 방식
	@RequestMapping(value="main", method=RequestMethod.POST)
	public String request(Model model) {
		model.addAttribute("result", "POST 방식");
		return "test1/view";
	}
	
	// GET / POST 방식
	// @RequestMapping(value="main2", method= {RequestMethod.GET, RequestMethod.POST})
	@RequestMapping(value="main2")
	public String request2(HttpServletRequest req, Model model) {
		String s = req.getMethod();
		model.addAttribute("result", "GET/POST 방식 : "+s);
		return "test1/view"; // 포워딩
	}
}
