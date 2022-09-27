package com.sopra.homecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Username {
	
	@RequestMapping("/sapna")
	public String about() 
	{
		return "username";
	}

}
