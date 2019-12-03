package com.sp.test2;

import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("test2.testController")
public class TestController {
	@RequestMapping(value="/test2/request", method=RequestMethod.GET)
	public String form() {
		return "test2/write";
	}
	
	/*
	 - ModelAndView
	  컨트롤러의 처리 결과를 보여줄 뷰와 뷰에 전달할 값을 저장하는 용도로 사용
	 */
	
	@RequestMapping(value="/test2/request", method=RequestMethod.POST)
	public ModelAndView submit(String num) {
		String s = null;
		
		try {
			int n = Integer.parseInt(num);
			int t = 0;
			for(int i=1;i<n;i++) {
				t+=i;
			}
			s="1~"+n+"까지 합 : "+t;
		} catch (Exception e) {
			/*
			 - 리턴 타입이 String인 경우 리다이렉트
			   return "redirect:/test2/error";
			 */
			return new ModelAndView("redirect:/test2/error");
		}
		
		ModelAndView mav = new ModelAndView("test2/view");
		mav.addObject("result", s);

		return mav;
	}
	
	@RequestMapping(value="/test2/error")
	public String error(Model model) {
		model.addAttribute("result", "숫자만 입력 해라..");
		return "test2/error";
	}
	
	@RequestMapping(value= {"/hello", "/hello2"})
	public void hello(HttpServletResponse resp) {
		Calendar cal = Calendar.getInstance();
		String s = String.format("%tF %tA %tT", cal, cal, cal);
		
		try {
			resp.setContentType("text/html;charset=utf-8");
			PrintWriter out = resp.getWriter();
			out.print("<html><body>할로~ 오늘은 "+s+" 입니다.</body></html>");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
