package com.sp.demo1;

import java.util.Iterator;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("demo1.demoController")
@RequestMapping("/demo1/request")
public class DemoController {
	@RequestMapping(method=RequestMethod.GET)
	public String form() {
		return "demo1/write";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(Model model, @RequestParam Map<String, String> paramMap) {
		String s;
		s="이름 : "+paramMap.get("name")+"<br>";
		s+="나이 : "+paramMap.get("age")+"<br>";
		s+="성별 : "+paramMap.get("gender")+"<br>";
		s+="취미 : ";
		
		Iterator<String> it = paramMap.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = paramMap.get(key);
			if(key.startsWith("hobby")) {
				s += value + " ";
			}
		}
		
		model.addAttribute("result", s);
		return "demo1/view";
	}
}
