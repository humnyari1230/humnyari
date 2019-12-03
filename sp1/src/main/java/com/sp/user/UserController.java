package com.sp.user;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// @RestController : jsp와 같은 뷰를 만들 목적이 아니라 REST 바익의 데이터를 처리하는데 사용
// AJAX에서 JSON 등의 데이터를 전솔할 때 주로 사용
// @ResponseBody 어노테이션이 포함되어 있음
@RestController("user.userController")
public class UserController {
	@RequestMapping(value="/user/data", produces="text/html;charset=utf-8")
	public String submit(@RequestParam String id,
						 @RequestParam String callback) throws Exception {
		String result = null;
		
		String name = "흠냐뤼";
		int age = 20;
		
		JSONObject job = new JSONObject();
		job.put("id", id);
		job.put("name", name);
		job.put("age", age);
		job.put("state", "성인");
		
		result = callback +"("+job.toString()+")";
		System.out.println(result);
		
		return result;
	}
}
