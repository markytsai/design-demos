package com.example.templatedemo.impl;

import com.example.templatedemo.core.OrderProcess;
import org.springframework.stereotype.Component;

@Component
public class ApProcess extends OrderProcess {

    @Override
    public void doStepOne() {
        System.out.println("AP step 1");
    }

    @Override
    public void doStepThree() {
        System.out.println("AP step 3");
    }

    @Override
    public void doStepTwo() {
        System.out.println("AP step 2");
    }
}
