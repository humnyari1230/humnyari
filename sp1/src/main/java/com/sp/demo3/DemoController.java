package com.sp.demo3;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("demo3.demoController")
public class DemoController {
	
	@RequestMapping("/demo3/main")
	public String main() {
		return "demo3/main";
	}
	
	@RequestMapping("/demo3/header")
	public String header(Model model, @RequestHeader("Accept-Language") String lang,
						@RequestHeader("User-Agent") String agent,
						HttpServletRequest req) {
		String s = null;
		
		String referer = req.getHeader("Referer"); // @RequestHeader로 확인 불가
		if(referer==null) referer = "이전 주소 업음";
		
		s = "<h3>헤더 정보</h3>";
		s += "클라이언트 언어 : "+lang+"<br>";
		s += "클라이언트 브라우저 및 OS : "+agent+"<br>";
		s += "클라이언트 이전 주소 : "+referer;
		
		model.addAttribute("result", s);
		
		return "demo3/view";
	}
	
	@RequestMapping("/demo3/cookieSet")
	public String cookieSet(Model model, HttpServletResponse resp) {
		Cookie c = new Cookie("subject", "java");
		resp.addCookie(c);
		
		model.addAttribute("msg", "쿠키 설정 완료");
		
		return "demo3/main";
	}
	
	// @CookieValue : 쿠키값 가져오기. 기본은 required=true이므로 쿠키가 없으면 에러
	@RequestMapping("/demo3/cookieGet")
	public String cookieGet(Model model, @CookieValue(name="subject", required=false) String subject) {
		String s = null;
		
		s = "쿠키 값 : " + subject;
		
		model.addAttribute("result", s);
		
		return "demo3/view";
	}
}
