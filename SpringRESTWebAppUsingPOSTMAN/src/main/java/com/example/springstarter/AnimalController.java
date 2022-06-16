package com.example.springstarter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AnimalController 
{
	@RequestMapping("chandu")
	public String home1()
	{
		System.out.println("Capgemini");
		return "animal.txt";
	}
}
