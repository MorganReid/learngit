package com.example.wxAppDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class wxAppController {
	@GetMapping("/hello1")
	public String hello1() {
	
		return "server data";
	}

	@GetMapping("/hello2")
	public String hello2(@RequestParam Integer id) {
		System.out.println(id);
		return "server data";
	}

	@RequestMapping(value = "/submit",method = RequestMethod.POST)
	@ResponseBody
	public User submit(@RequestBody User user) {
		System.out.println(user);
		return user;
		
	}
}
