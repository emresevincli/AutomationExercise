package com.automationexercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    private WebElement nameInputBox;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    private WebElement emailInputBox;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    private WebElement signUpButton;

    

}
