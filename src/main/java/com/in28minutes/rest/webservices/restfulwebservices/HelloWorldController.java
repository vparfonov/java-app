package com.in28minutes.rest.webservices.restfulwebservices;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/")
	public String helloWorld() {
		
		try{
			ArrayList<String> list = new ArrayList<String>();
			list.get(1);
			}
		catch(Exception e){
			e.printStackTrace();	
		}
		return "{\"message\":\"Hello World Java v1\"}";
	}
}
