package com.sp.demo;

import org.springframework.stereotype.Controller;

/*
 - @RequestParam
   일반적으로 get방식으로 넘어온 query String(파라미터)를 넘겨 받을 때 사용
   기본적으로 필수이므로 넘어온 파라미터가 없으면 400 에러가 발생한다.
 */

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("demo.demoController")
public class DemoController {
	@RequestMapping("/demo/main")
	public String main() {
		return "demo/main";
	}
	
	@RequestMapping("/demo/request")
	public String submit(Model model, @RequestParam(name="a", defaultValue="0") int age, @RequestParam(defaultValue="m") String gender) {
		// 파라미터와 넘겨 받는 이름이 다른 경우 name속성에 파라미터 이름을 명시
		// defaultValue는 넘겨오는 값이 없으면 초기값 설정
		String s = "결과 -> ";
		try {
		s+="나이 : "+age+", 성별 : "+(gender.equals("m")?"남자":"여자");
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("result", s);
		return "demo/view";
	}
}
