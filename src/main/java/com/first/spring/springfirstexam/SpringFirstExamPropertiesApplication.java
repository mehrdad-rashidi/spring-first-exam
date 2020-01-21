package com.first.spring.springfirstexam;

import com.first.spring.springfirstexam.basic.BinarySearchImpl;
import com.first.spring.springfirstexam.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@SpringBootApplication
@Configuration
@ComponentScan
@PropertySource("classpath:app.prop.properties")
public class SpringFirstExamPropertiesApplication {

	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext annotationConfigApplicationContext =
					new AnnotationConfigApplicationContext(SpringFirstExamPropertiesApplication.class)) {
			SomeExternalService someExternalService =
					annotationConfigApplicationContext.getBean(SomeExternalService.class);
			System.out.println(someExternalService.returnSrviceUrl());

		}


		//annotationConfigApplicationContext.close();
	}

}
