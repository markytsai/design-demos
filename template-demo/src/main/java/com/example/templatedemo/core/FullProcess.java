package com.example.templatedemo.core;

import com.example.templatedemo.inter.FullStep;

public abstract class FullProcess extends ProcessImpl implements FullStep {

    public void init() {
        setStepOne(this);
        setStepTwo(this);
        setStepThree(this);
    }

}
