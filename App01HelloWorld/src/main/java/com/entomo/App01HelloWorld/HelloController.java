package com.entomo.App01HelloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
	
	@RequestMapping("/showhello/{name}")
	public String showHello(@PathVariable("name") String name)
	{
		name=name.toUpperCase();
		return "Hello, "+name;
	}

}
