package com.ki.stepDefs;

import com.ki.CucumberSpringConfiguration;
import com.ki.page.base.Base;
import com.ki.page.coverage.Coverage;
import com.ki.page.primaryDetails.PrimaryDetailsPage;
import com.ki.page.welcome.WelcomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;


public class NewQuote  extends CucumberSpringConfiguration {

    @Autowired
    private WelcomePage welcomePage;

    @Autowired
    private PrimaryDetailsPage primaryDetailsPage;

    @Autowired
    private Coverage coverage;

    @Autowired
    private Base basePage;
    @Autowired
    private static WebDriver driver;

    @Given("mock platform page is opened")
    public void mockPlatformPageIsOpened() {
        welcomePage.goTo();
        assertThat(welcomePage.getWelcomePageTitle()).contains("Ki Mock Platform");
    }


    @When("the user selects {string} option")
    public void theUserSelectsOption(String option) {
        welcomePage.selectToDoOption(option);
    }

    @And("clicks on {string} button")
    public void clicksOnButton() {
        basePage.clickNext();
    }

    @And("the user selects primary country {string} option")
    public void theUserSelectsPrimaryCountryOption(String country) {
        primaryDetailsPage.selectCountry(country);
    }

    @And("the user selects primary insured {string} option")
    public void theUserSelectsPrimaryInsuredOption(String insured) {
        primaryDetailsPage.selectInsured(insured);
    }

    @And("the user selects class of business {string} option")
    public void theUserSelectsClassOfBusinessOption(String business) {
        primaryDetailsPage.selectClassOfBusiness(business);
    }

    @And("the user enters Inception date {string}")
    public void theUserEntersInceptionDate(String date) {
        coverage.enterInceptionDate(date);
    }

    @And("the user enters AUM Value {string}")
    public void theUserEntersAUMValue(String aumValue) {
        coverage.enterAumValue(aumValue);
    }

    @And("the user enters Premium {string}")
    public void theUserEntersPremium(String premium) {
        coverage.enterPremium(premium);
    }

    @And("the quote should be created successfully")
    public void theQuoteShouldBeCreatedSuccessfully() {
        assertThat(welcomePage.getSuccessMessage()).contains("Success");
    }

//    @After
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
