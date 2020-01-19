package com.first.spring.springfirstexam;

import com.first.spring.componentscan.ComponentDAO;
import com.first.spring.springfirstexam.basic.BinarySearchImpl;
import com.first.spring.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.first.spring.componentscan")
public class SpringFirstExamComponentScanApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringFirstExamScopeApplication.class);
	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringFirstExamComponentScanApplication.class, args);
		ComponentDAO componentDAO  = applicationContext.getBean(ComponentDAO.class);
		logger.info("{}",componentDAO);


	}

}
