package com.automationexercise.pages;

import com.automationexercise.utilities.BrowserUtils;
import com.automationexercise.utilities.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//h2[text()='Login to your account']")
    private WebElement loginText;
    @FindBy(xpath = "//input[@data-qa='login-email']")
    private WebElement emailInputBox;
    @FindBy(xpath = "//input[@data-qa='login-password']")
    private WebElement passwordInputBox;
    @FindBy(xpath = "//button[@data-qa='login-button']")
    private WebElement loginButton;
    @FindBy(xpath = "//a[text()=' Delete Account']")
    private WebElement deleteAccountButton;
    @FindBy(xpath = "//b[text()='Account Deleted!']")
    private WebElement deleteAccountText;
    @FindBy(xpath = "//a[text()=' Logged in as ']")
    private WebElement loggedText;
    @FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
    private WebElement errorMessage;

    public void loginTextIsVisible(){
        String expected = loginText.getText();
        String actual = "Login to your account";
        Assert.assertEquals(expected,actual);
    }

    public void login(){
        emailInputBox.sendKeys(ConfigurationReader.get("email"));
        passwordInputBox.sendKeys(ConfigurationReader.get("password"));
        BrowserUtils.clickWithJS(loginButton);
    }

    public void login(String email, String password){
        emailInputBox.sendKeys(email);
        passwordInputBox.sendKeys(password);
        BrowserUtils.clickWithJS(loginButton);
    }

    public void errorMessage(){
        String expected = errorMessage.getText();
        String actual = "Your email or password is incorrect!";
        Assert.assertEquals(expected,actual);
    }

    public void loggedText(){
        String expected = loggedText.getText().trim();
        String actual = "Logged in as";
    }


    public void deleteAccount(){
        BrowserUtils.clickWithJS(deleteAccountButton);
    }

    public void deleteAccountText(){
        String expected = deleteAccountText.getText();
        String actual = "ACCOUNT DELETED!";
        Assert.assertEquals(expected,actual);
    }

}
