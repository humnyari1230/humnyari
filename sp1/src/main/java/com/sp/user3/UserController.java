package com.sp.user3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("user3.userController")
public class UserController {
	
	@RequestMapping(value="/user3/write", method=RequestMethod.GET)
	public String form() {
		return "user3/write";
	}
	
	@RequestMapping(value="/user3/write", method=RequestMethod.POST)
	public String submit(String name, String[] subject, Model model) {
		// 파라미터의 이름이 동일한 경우 배열로 넘겨 받을 수 있다.
		
		String s = "이름 : "+name+"<br>";
		s+="좋아하는 과목 : ";
		if(subject!=null) {
			for(String a : subject) {
				s+=a+" ";
			}
		}
		
		model.addAttribute("result", s);
		
		return "user3/view";
	}
}
