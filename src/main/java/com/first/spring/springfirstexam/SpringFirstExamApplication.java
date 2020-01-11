package com.first.spring.springfirstexam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFirstExamApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl();
		int result = binarySearch.binarySearch(new int[]{1,2,3},3);
		System.out.println(result);
		SpringApplication.run(SpringFirstExamApplication.class, args);
	}

}
