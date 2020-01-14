package com.first.spring.springfirstexam;

import com.first.spring.springfirstexam.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFirstExamBasicApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		//System.out.println(result);
		ApplicationContext applicationContext = SpringApplication.run(SpringFirstExamBasicApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		int result = binarySearch.binarySearch(new int[]{1,2,3},3);
		System.out.println("test");
		System.out.println(result);

	}

}
