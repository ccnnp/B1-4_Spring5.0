package com.example.springstarter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController
{
	@RequestMapping("chandana")
	public String home()
	{
		System.out.println("B1-4 Student");
		return "home.jsp";
	}

}