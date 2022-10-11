package com.ki.page.welcome;

import com.ki.aut.model.IWelcomePage;
import com.ki.page.base.Base;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public abstract class WelcomePage extends Base implements IWelcomePage  {
    @Value("${application.url}")
    private String url;

//    private WebDriver driver;

    @Override
    public void goTo() {
        driver.get(url);
    }

    @Override
    public String getWelcomePageTitle() {
        return driver.getTitle();
    }

    @Override
    public void selectToDoOption(String option) {
        driver.findElement(By.xpath("//div[contains(text(),'"+option+"')]"));
    }

    @Override
    public String getSuccessMessage() {
       return driver.findElement(By.xpath("//*contains[text()='Success — Quote created']")).getText();
    }

}
