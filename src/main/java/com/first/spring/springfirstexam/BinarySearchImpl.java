package com.first.spring.springfirstexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor){
        //Implement Sorting Logic
        //BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        //int [] sortedNumber = bubbleSortAlgorithm.sort(number);
        int [] sortedNumber = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        //Search the Array
        return 3;


    }
}
