package com.first.spring.springfirstexam.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {
    @Inject
    SomeCdiDao someCdiDao;

    public SomeCdiDao getSomeCdiDao() {

        return someCdiDao;
    }

    public void setSomeCdiDao(SomeCdiDao someCdiDao) {

        this.someCdiDao = someCdiDao;
    }

    public int findGreatest(){
        int geatest = Integer.MIN_VALUE;
        int[] data =  someCdiDao.getData();
        for (int value : data) {
            if (    value > geatest){
                geatest = value;
            }
        }
        return geatest;
    }
}
