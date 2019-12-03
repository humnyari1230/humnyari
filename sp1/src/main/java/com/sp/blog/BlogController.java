package com.sp.blog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("blog.blogController")
public class BlogController {
	@Autowired
	private BlogService service;
	@RequestMapping("/blog")
	public String blog(Model model) {
		List<Blog> list = service.listBlog();
		
		model.addAttribute("list", list);
		
		return "blog/list";
	}
	
	@RequestMapping("/blog/b{seq}/main")
	public String main(@PathVariable int seq, Model model) {
		List<Blog> list = service.listBlog();
		Blog dto = null;
		
		for(Blog vo : list) {
			if(vo.getUserSeq()== seq) {
				dto = vo;
				break;
			}
		}
		model.addAttribute("dto", dto);
		
		return "blog/main";
	}
}
