package com.first.spring.springfirstexam.basic;

import com.first.spring.springfirstexam.SpringFirstExamBasicApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.stream.Location;

import static org.junit.Assert.*;
// Load the Context
@RunWith(SpringRunner.class)
//@ContextConfiguration(classes = SpringFirstExamBasicApplication.class)
@ContextConfiguration(locations="/applicationContext.xml")
public class BinarySearchTest {

    //Get This Bean From The Context
    @Autowired
    BinarySearchImpl binarySearch;
    @Test
    public void basicScenario(){
        int result = binarySearch.binarySearch(new int[]{},5);
        assertEquals(3,result);
    }
}
