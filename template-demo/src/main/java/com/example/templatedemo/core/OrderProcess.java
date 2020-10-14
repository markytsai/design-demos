package com.example.templatedemo.core;


import com.example.templatedemo.inter.FullStep;

import javax.annotation.PostConstruct;

public class OrderProcess extends FullProcess implements FullStep {


    @PostConstruct
    public void initialize() {
        super.init();
    }

    @Override
    Process nextProcess() {
        return null;
    }

    @Override
    public void doStepOne() {

    }

    @Override
    public void doStepThree() {

    }

    @Override
    public void doStepTwo() {

    }
}
