package com.first.spring.springfirstexam;

import com.first.spring.springfirstexam.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringFirstExamBasicApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		//System.out.println(result);
		//ApplicationContext annotationConfigApplicationContext = SpringApplication.run(SpringFirstExamBasicApplication.class, args);
		try(AnnotationConfigApplicationContext annotationConfigApplicationContext =
					new AnnotationConfigApplicationContext(SpringFirstExamBasicApplication.class)) {
			//AnnotationConfigApplicationContext annotationConfigApplicationContext =
			// new AnnotationConfigApplicationContext(SpringFirstExamBasicApplication.class);
			BinarySearchImpl binarySearch = annotationConfigApplicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearch1 = annotationConfigApplicationContext.getBean(BinarySearchImpl.class);
			System.out.println(binarySearch);
			System.out.println(binarySearch1);
			int result = binarySearch.binarySearch(new int[]{1,2,3},3);
			System.out.println("test");
			System.out.println(result);
		}


		//annotationConfigApplicationContext.close();
	}

}
