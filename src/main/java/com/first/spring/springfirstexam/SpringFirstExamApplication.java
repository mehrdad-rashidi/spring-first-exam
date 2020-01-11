package com.first.spring.springfirstexam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFirstExamApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		//System.out.println(result);
		ApplicationContext applicationContext = SpringApplication.run(SpringFirstExamApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[]{1,2,3},3);
		System.out.println("test");
		System.out.println(result);

	}

}
