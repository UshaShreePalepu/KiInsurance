package com.ki;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(value = "classpath:cucumber.xml")
public class CucumberSpringConfiguration {
}
