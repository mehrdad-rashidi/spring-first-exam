package com.first.spring.springfirstexam;

import com.first.spring.springfirstexam.basic.BinarySearchImpl;
import com.first.spring.springfirstexam.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class SpringFirstExamScopeApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringFirstExamScopeApplication.class);
	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringFirstExamScopeApplication.class, args);
		PersonDAO personDAO  = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2  = applicationContext.getBean(PersonDAO.class);
		logger.info("{}",personDAO);
		logger.info("{}",personDAO.getJdbcConnection());
		logger.info("{}",personDAO2);
		logger.info("{}",personDAO2.getJdbcConnection());
	}

}
