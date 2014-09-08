package org.jeedevframework.dubbo.service.impl;

import org.jeedevframework.dubbo.service.DemoService;
import org.springframework.stereotype.Service;

@Service
@com.alibaba.dubbo.config.annotation.Service(version="1.0.0") 
public class DemoServiceImpl implements DemoService {
	public String sayHello(String name) {
		return "Hello " + name;
	}
}
