package com.skillsoft.springinitializer.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;

@Controller

public class HelloController 
{
     @GetMapping (value = "/home")
     public String index()
     {
    	 
    	 return "home";
     }
     
     
}
