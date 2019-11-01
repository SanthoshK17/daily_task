package com.MCon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MController {
	
	@RequestMapping("/Start")
	public String Start()
	{
		System.out.println("Inside Start");
		return "Display1";
	}

}
 