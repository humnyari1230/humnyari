package com.sp.blog;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("blog.blogService")
public class BlogServiceImpl implements BlogService {

	@Override
	public List<Blog> listBlog() {
		List<Blog> list = new ArrayList<>();
		
		list.add(new Blog(1001, "java", "자바", "자바 프로그래밍"));
		list.add(new Blog(1002, "spring", "자바", "스프링 프로그래밍"));
		list.add(new Blog(2001, "html", "홈페이지", "홈페이지 작성"));
		list.add(new Blog(2002, "css", "스타일", "멋지게 꾸미자"));
		list.add(new Blog(2003, "javascript", "자바스크립트", "스크립트 완성!"));
		
		return list;
	}

}
