package Palvelinohjelmointi.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping("alku")
	@ResponseBody
	public String sayHello() {
		return "Hei";
	}
	
	
@RequestMapping("moi")
@ResponseBody
public String sayHelloToSomeone(@RequestParam(name="nimi", required=false, defaultValue = "Muumi") String etunimi, @RequestParam(name="ika") String age) {
	return "Hei " + etunimi + ", " + age + " vuotta";
	}

@RequestMapping("/index")
@ResponseBody
public String returnIndexPage(){
	return "This is the main page";
	}

@RequestMapping("/contact")
@ResponseBody
public String returnContacInfoe(){
	return "This is the contact page";
	}

@RequestMapping("hello")
@ResponseBody
public String helloPage(@RequestParam(name="location", required=false, defaultValue = "World Citizen") String location, @RequestParam(name="name") String name){
	return "Welcome to the " + location + " " + name + ". You are Loved!";
	}
}
