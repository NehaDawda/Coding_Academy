package com.jp.hr.interceptors;

import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class DateInsertionInterceptor implements HandlerInterceptor {
	private RequestDispatcher dispatch = null;
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse res,
			Object arg2) throws Exception {
		System.out.println("In preHandle()");
	
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse res,
			Object arg2, ModelAndView modelAndView) throws Exception {
			System.out.println("in postHandle()...");
			
			//modelAndView.addObject("currentTime", new Date());
	}

	@Override
	public void afterCompletion(HttpServletRequest req,
			HttpServletResponse res, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("in afterCompletion()...");
	}
}
