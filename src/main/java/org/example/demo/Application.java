package org.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A sample hello world web application (WAR file)
 * @author lmthien
 * @see: http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#howto-create-a-deployable-war-file
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		//thien: Add More code from: http://spring.io/guides/gs/spring-boot/
//		System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//		String[] beanNames = ctx.getBeanDefinitionNames();
//		Arrays.sort(beanNames);
//		for (String beanName : beanNames) {
//			System.out.println(beanName);
//		}
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		//thien: must override this method
		return application.sources(Application.class);
	}
}

@RestController
class GreetingController {
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return "Hello, " + name + " !";
	}
	
	@RequestMapping("/goodbye/{name}")
	public String goodbye(@PathVariable String name) {
		String value = "Goodbye, " + name + " !"; 
		return value;
	}
	
	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
