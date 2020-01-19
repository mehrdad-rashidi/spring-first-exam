package com.first.spring.springfirstexam.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    @Qualifier("quick")
    private SortAlgorithm sortAlgorithm;

   /* public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }*/

    public int binarySearch(int[] numbers, int numberToSearchFor){
        //Implement Sorting Logic
        //BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        //int [] sortedNumber = bubbleSortAlgorithm.sort(number);
        int [] sortedNumber = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        //Search the Array
        return 3;


    }

    public SortAlgorithm getSortAlgorithm() {
        return sortAlgorithm;
    }


    @PostConstruct
    public void postConstruct(){
        logger.info("PostConstruct");
    }
    @PreDestroy
    public void preDestroy(){
        logger.info("preDestroy");
    }

/*    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }*/

}
