package com.kabaso.calculator;

import com.kabaso.calculator.config.AppConfig;
import com.kabaso.calculator.service.CalculatorService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by boniface on 2014/02/18.
 */
public class CalculatorTest {
    private CalculatorService calculatorService;



    @BeforeMethod
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        calculatorService = (CalculatorService)ctx.getBean("calc");

    }

    @AfterMethod
    public void tearDown() throws Exception {

    }
    @Test
    public void testAdd() throws Exception {
        int result = calculatorService.add(5,5);
        Assert.assertEquals(result,10," Sum of two numbers 5 +5 is 10");
    }
    @Test
    public void testSubtract() throws Exception {
        int result = calculatorService.subtract(5,5);
        Assert.assertEquals(result,0," Difference  of two numbers 5 +5 is 0");
    }

    @Test
    public void testMultiply() throws Exception {
        int result = calculatorService.multiply(5,5);
        Assert.assertEquals(result,25," Product  of two numbers 5 +5 is 25");
    }

    @Test
    public void testDivide() throws Exception {
        int result = calculatorService.divide(5,5);
        Assert.assertEquals(result,1," Quotient of two numbers 5 +5 is 1");
    }
}
