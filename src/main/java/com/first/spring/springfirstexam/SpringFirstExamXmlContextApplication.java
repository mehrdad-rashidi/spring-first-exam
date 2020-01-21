package com.first.spring.springfirstexam;

import com.first.spring.springfirstexam.basic.BinarySearchImpl;
import com.first.spring.springfirstexam.xml.XmlPersonDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringFirstExamXmlContextApplication {

	public static void main(String[] args) {

		try(ClassPathXmlApplicationContext classPathXmlApplicationContext =
					new ClassPathXmlApplicationContext("applicationContext.xml")) {

			XmlPersonDAO xmlPersonDAO = classPathXmlApplicationContext.getBean(XmlPersonDAO.class);
			System.out.println(xmlPersonDAO);
			System.out.println(xmlPersonDAO.getXmlJdbcConnection());
		}


		//annotationConfigApplicationContext.close();
	}

}
