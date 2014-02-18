package com.kabaso.calculator.service.Impl;

import com.kabaso.calculator.service.CalculatorService;

/**
 * Created by boniface on 2014/02/18.
 */
public class ImprovedCalculatorServiceImpl implements CalculatorService{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int multiply(int a, int b) {
        // use a loop to do multiplcation
        return a*b;
    }

    @Override
    public int divide(int a, int b) {
        // Taking care of Divide by Zero
        if(b!=0)
            return a/b;
        return 0;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }
}
