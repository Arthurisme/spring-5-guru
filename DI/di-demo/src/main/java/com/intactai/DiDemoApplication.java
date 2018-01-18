package com.intactai;

import com.intactai.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args );
		MyController mycontrollor = (MyController)ctx.getBean("myController");
		mycontrollor.hello();
	}
}
