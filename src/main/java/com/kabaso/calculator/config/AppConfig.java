package com.kabaso.calculator.config;

import com.kabaso.calculator.service.CalculatorService;
import com.kabaso.calculator.service.Impl.CalculatorServiceImpl;
import com.kabaso.calculator.service.Impl.ImprovedCalculatorServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by boniface on 2014/02/18.
 */
@Configuration
public class AppConfig {
    @Bean(name="retiredcalc")
    public CalculatorService getService(){
        return new CalculatorServiceImpl();
    }

    @Bean(name="calc")
    public CalculatorService getImprovedService(){
        return new ImprovedCalculatorServiceImpl();
    }
}
