package com;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageService {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	
	@GetMapping("/add")
	public int addition() {
		return 75+25;
	}
	
	@GetMapping("/sub")
	public int substraction() {
		return 75-25;
	}
	
	@GetMapping("/mul")
	public int multiplication() {
		return 75*25;
	}
	
	@GetMapping("/div")
	public int division() {
		return 75/25;
	}
	
	@GetMapping("/subStr")
	public String subStringofStr() {
		String str = "devops";
		return str.substring(3,5);
	}
	
	@GetMapping("/comapre")
	public boolean compareStr() {
		String a = "dev";
		String b= "ops";
		return a.equalsIgnoreCase(b);
	}
	
	@GetMapping("/concat")
	public String concatStr() {
		String a = "dev";
		String b= "ops";
		return a.concat(b);
	}
	
	@GetMapping("/mod")
	public int saymod() {
		int a = 89;
		int b= 7;
		return a%b;
	}
	
	@GetMapping("/list")
	public int displayList() {
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("devops");
		courses.add("sonar");
		courses.add("kubernetes");
		courses.add("docker");
		return courses.size();
	}
}
