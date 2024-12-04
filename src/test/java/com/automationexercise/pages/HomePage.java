package com.automationexercise.pages;

import com.automationexercise.utilities.BrowserUtils;
import com.automationexercise.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(partialLinkText = "Signup / Login")
    private WebElement signUpButton;
    @FindBy(partialLinkText = "Contact us")
    private WebElement contactUsButton;
    @FindBy(xpath = "//h2[text()='New User Signup!']")
    private WebElement signUpText;
    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    private WebElement subscriptionText;
    @FindBy(xpath = "//input[@id='susbscribe_email']")
    private WebElement emailInputBox;
    @FindBy(xpath = "//button[@id='subscribe']")
    private WebElement subscribeButton;
    @FindBy(xpath = "//div[@class='alert-success alert']")
    private WebElement successMessage;

    public void homePageIsVisible(){

        String expectedUrl = "https://automationexercise.com/";
        String actualUrl = Driver.get().getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void clickLoginButton (){
        BrowserUtils.clickWithJS(signUpButton);
    }
    public void clickContactUsButton (){ BrowserUtils.clickWithJS(contactUsButton); }


    public void signUpTextIsVisible(){
        String expected = "New User Signup!";
        String actual = signUpText.getText();
        Assert.assertEquals(expected,actual);
    }

    public void scrollDownToFooter(){

        js = (JavascriptExecutor) Driver.get();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

    }
    public void subscriptionTextIsVisible(){
        String expected = "SUBSCRIPTION";
        String actual = subscriptionText.getText();
        Assert.assertEquals(expected,actual);
    }

    public void subscription(String email) throws InterruptedException {

        email = generateRandomEmail();
        emailInputBox.sendKeys(email);
        BrowserUtils.clickWithJS(subscribeButton);

        Thread.sleep(2000);

    }

    public void verifySuccessMessage(String expectedMessage) {

        String actualMessage = "You have been successfully subscribed!";
        Assert.assertEquals(expectedMessage, actualMessage);


    }
}

