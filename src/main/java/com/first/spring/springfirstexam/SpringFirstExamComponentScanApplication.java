package com.first.spring.springfirstexam;

import com.first.spring.componentScan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.first.spring.componentScan")
public class SpringFirstExamComponentScanApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringFirstExamComponentScanApplication.class);
	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringFirstExamComponentScanApplication.class, args);
		ComponentDAO componentDAO  = applicationContext.getBean(ComponentDAO.class);
		logger.info("{}",componentDAO);


	}

}
