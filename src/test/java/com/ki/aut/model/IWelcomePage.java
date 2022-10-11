package com.ki.aut.model;

public interface IWelcomePage {
    void goTo();
    String getWelcomePageTitle();
    void selectToDoOption(String option);
    String getSuccessMessage();
}
