package com.nikhil ;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nikhil.service.AddService;


@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest req, HttpServletResponse res){
		int a=Integer.parseInt(req.getParameter("t1"));
		
		AddService as = new AddService();
		int k=as.add(a);
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("number.jsp");
		mv.addObject("result",k);
		
		return mv;
	}
	
}
