package com.javier;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
    @RequestMapping("/")
    public String hello() {
            return "<h1>Hello Human!</h1><br>Welcome to SpringBoot!";
    }
	
    @RequestMapping("/{name}")
    public String showLesson(@PathVariable("name") String name){
    	return "<h1>Hello "+ name + "!</h1><br>Welcome to SpringBoot!<br><a href='./'>Go Back</a>";
    }
    
    @RequestMapping("/{name}/{lname}")
    public String showLesson(@PathVariable("name") String name, @PathVariable("lname") String lname){
    	return "<h1>Hello "+ name + " "+ lname + "!</h1><br>Welcome to SpringBoot!<br><a href='./'>Go Back</a>";
    }
    
}
