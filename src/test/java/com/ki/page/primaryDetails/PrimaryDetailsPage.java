package com.ki.page.primaryDetails;

import com.ki.aut.model.IPrimaryDetailsPage;
import com.ki.page.base.Base;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public abstract class PrimaryDetailsPage extends Base implements IPrimaryDetailsPage {

    @Override
    public void selectCountry(String country) {
        driver.findElement(By.xpath("//*div[contains(text(),'"+country+"')]")).click();
    }
    @Override
    public void selectInsured(String insured) {
        driver.findElement(By.xpath("//*div[contains(text(),'"+insured+"')]")).click();
    }
    @Override
    public void selectClassOfBusiness(String business) {
        driver.findElement(By.xpath("//*div[contains(text(),'"+business+"')]")).click();
    }
}
