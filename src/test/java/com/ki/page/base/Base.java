package com.ki.page.base;

import com.ki.CucumberSpringConfiguration;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.time.Duration;

public abstract class Base extends CucumberSpringConfiguration {
    @Autowired
    protected static
    WebDriver driver;

//    @Autowired
    protected WebDriverWait webDriverWait;

    @Before
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    public void clickNext() {
        driver.findElement(By.linkText("Next")).click();
    }

    @PostConstruct
    private void init() {
        PageFactory.initElements(this.driver,this);
    }
}
