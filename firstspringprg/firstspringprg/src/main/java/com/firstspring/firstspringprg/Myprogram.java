package com.firstspring.firstspringprg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Myprogram {
	@RequestMapping("/test")
	public String Myname() {	
		return "Altaf";
	}
}
