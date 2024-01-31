package com.automationexercise.pages;

import com.automationexercise.utilities.BrowserUtils;
import com.automationexercise.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(partialLinkText = "Signup / Login")
    private WebElement signUpButton;

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    private WebElement signUpText;

    public void homePageIsVisible(){

        String expectedUrl = "https://automationexercise.com/";
        String actualUrl = Driver.get().getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void clickLoginButton (){
        BrowserUtils.clickWithJS(signUpButton);
    }

    public void signUpTextIsVisible(){
        String expected = "New User Signup!";
        String actual = signUpText.getText();
        Assert.assertEquals(expected,actual);
    }
}
