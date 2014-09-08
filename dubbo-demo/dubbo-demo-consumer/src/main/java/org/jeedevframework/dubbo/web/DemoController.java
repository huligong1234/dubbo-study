package org.jeedevframework.dubbo.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.jeedevframework.dubbo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping
public class DemoController {
	private Logger logger = Logger.getLogger(DemoController.class.getName());
	
	@Autowired
	public DemoService demoService;
	
	@RequestMapping("/sayHello")
	@ResponseBody
	public String sayHello(String name, HttpServletRequest request, HttpServletResponse response) throws Exception{
		logger.info("Request Parameters: "+ name);
		String message = demoService.sayHello(name);
/*		PrintWriter out = response.getWriter();
		out.write(message);
		out.flush();
		out.close();*/
		logger.info("Response Parameters: "+ message);
		return message;
	}
}
