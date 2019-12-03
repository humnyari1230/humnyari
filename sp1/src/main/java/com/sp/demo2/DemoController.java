package com.sp.demo2;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/*
 Map 또는 List로 파라미터를 넘겨받기 위해서는 @RequestParam 어노테이션을 붙여야 한다.
 */

@Controller("demo2.demoController")
@RequestMapping("/demo2/request")
public class DemoController {
	@RequestMapping(method=RequestMethod.GET)
	public String form() {
		return "demo2/write";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(Model model, @RequestParam String name, @RequestParam List<String> hobby) {
		String s;
		s="이름 : "+name+"<br>";
		s+="취미 : ";
		
		if(hobby != null) {
			for(String h : hobby) {
				s += h +" ";
			}
		}
		
		model.addAttribute("result", s);
		return "demo2/view";
	}
}
