package com.ki.testRunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/"},
        plugin   = {"pretty"},
        glue     = {"com/ki/stepDefs"})
public class Runner {
}
