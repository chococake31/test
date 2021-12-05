package com.newlecture.web.controller.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

public class ListController implements Controller {
	
	private NoticeService noticeService;

	
	
	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}


	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mv = new ModelAndView("notice.list");
//		mv.setViewName("/WEB-INF/view/notice/list.jsp");
//		mv.addObject("data", "Hello MVC !!!");
		
		List<Notice> list = noticeService.getList(3, "title", "");
		mv.addObject("list", list);	// model로 list가 담겨진 것 
		
		return mv;
	}

}
