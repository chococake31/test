package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/")
public class HomeController  {	// 여러가지 Controller를 담는 폴더의 개념으로 바뀜 
	
	@RequestMapping("index")
	public String index() {
		
		return "root.index";
	}
	
	

//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		ModelAndView mv = new ModelAndView("root.index");
//		mv.addObject("data", "Hello MVC !!!");
//
//		return mv;
//	}
	
	

}
