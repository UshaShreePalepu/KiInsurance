package com.ki.page.coverage;

import com.ki.aut.model.ICoverage;
import com.ki.page.base.Base;
import org.openqa.selenium.By;

public class Coverage extends Base implements ICoverage {
    @Override
    public void enterInceptionDate(String date) {
        driver.findElement(By.xpath("//*div[@id=\"mG61Hd\" and type()=\"date\"]")).sendKeys(date);
    }
    @Override
    public void enterAumValue(String aumValue) {
        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div[1]/div/div[1]/input")).sendKeys(aumValue);
    }

    @Override
    public void enterPremium(String premium) {
        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div/div[1]/input")).sendKeys(premium);
    }
}
