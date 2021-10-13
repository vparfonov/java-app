package com.in28minutes.rest.webservices.restfulwebservices;
import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfulWebServicesApplication {

	public static void main(String[] args) {
		
		try{
			ArrayList<String> list = new ArrayList<String>();
		
			list.get(1);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}
}
