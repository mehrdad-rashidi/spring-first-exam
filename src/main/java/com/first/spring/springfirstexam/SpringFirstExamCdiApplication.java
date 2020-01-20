package com.first.spring.springfirstexam;

import com.first.spring.springfirstexam.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringFirstExamCdiApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringFirstExamCdiApplication.class);
	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringFirstExamCdiApplication.class, args);
		SomeCdiBusiness someCdiBusiness  = applicationContext.getBean(SomeCdiBusiness.class);
		logger.info("{} dao-{}",someCdiBusiness,someCdiBusiness.getSomeCdiDao());

	}

}
