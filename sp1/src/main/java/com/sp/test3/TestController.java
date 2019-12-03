package com.sp.test3;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("test3.testController")
public class TestController {
	
	// Map을 리턴하면 주소가 /test3/hello 이면 뷰의 이름은 자동으로 test3/hello
	@RequestMapping(value="/test3/hello")
	public Map<String, Object> execute() {
		Map<String, Object> map = new HashMap<>();
		map.put("result", "Map 인터페이스를 리턴 타입으로 포워딩");
		
		return map;
	}
	
	@RequestMapping(value="/test3/hello2")
	public Model execute2() {
		Model model = new ExtendedModelMap();
		model.addAttribute("result", "Map 인터페이스를 리턴 타입으로 포워딩");
		
		return model;
	}
	
	@RequestMapping(value="/test3/hello3")
	public ModelMap execute3() {
		ModelMap model = new ExtendedModelMap();
		model.addAttribute("result", "ModelMap 클래스를 리턴 타입으로 포워딩");
		
		return model;
	}
}
