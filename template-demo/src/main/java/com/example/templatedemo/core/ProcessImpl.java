package com.example.templatedemo.core;


import com.example.templatedemo.inter.StepOne;
import com.example.templatedemo.inter.StepThree;
import com.example.templatedemo.inter.StepTwo;
import lombok.Data;

@Data
public abstract class ProcessImpl implements Process {

    private StepOne stepOne;

    private StepTwo stepTwo;

    private StepThree stepThree;


    @Override
    public void process() {

        if (stepOne != null) {

            stepOne.doStepOne();
        }

        if (stepTwo != null) {
            stepTwo.doStepTwo();
        }

        if (stepThree != null) {
            stepThree.doStepThree();
        }

        if (nextProcess() != null) {
            nextProcess().process();
        }
    }


    abstract Process nextProcess();
}
