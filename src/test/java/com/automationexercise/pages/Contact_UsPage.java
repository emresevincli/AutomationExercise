package com.automationexercise.pages;

import com.automationexercise.utilities.BrowserUtils;
import com.automationexercise.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contact_UsPage extends BasePage{




    @FindBy(xpath = ("//h2[text()='Get In Touch']"))
    private WebElement getInTouchText;
    @FindBy(xpath = "//input[@data-qa='name']")
    private WebElement nameInputBox;
    @FindBy(xpath = "//input[@data-qa='email']")
    private WebElement emailInputBox;
    @FindBy(xpath = "//input[@data-qa='subject']")
    private WebElement subjectInputBox;
    @FindBy(xpath = "//textarea[@data-qa='message']")
    private WebElement messageInputBox;
    @FindBy(name = "upload_file")
    private WebElement uploadFile;
    @FindBy(xpath = "//input[@data-qa='submit-button']")
    private WebElement submitButton;
    @FindBy(xpath = "//div[@class='status alert alert-success']")
    private WebElement successMessage;
    @FindBy(xpath = "//span[text()=' Home']")
    private WebElement homeButton;


    public void verifyGetInTouchText(){
        String expected = getInTouchText.getText();
        String actual = "GET IN TOUCH";
        Assert.assertEquals(expected,actual);
    }

    public void contactUsForm(String name, String email, String subject, String message){
        nameInputBox.sendKeys(name);
        emailInputBox.sendKeys(email);
        subjectInputBox.sendKeys(subject);
        messageInputBox.sendKeys(message);
        String filePath = "C:\\Users\\Emre\\Desktop\\sorular.txt";
        uploadFile.sendKeys(filePath);
        BrowserUtils.clickWithJS(submitButton);
    }

    public void clickOkButton(){
        alert = Driver.get().switchTo().alert();
        alert.accept();
    }

    public void verifySuccessMessage(){
        String expected = successMessage.getText();
        String actual = "Success! Your details have been submitted successfully.";
        Assert.assertEquals(expected,actual);
    }

    public void clickOnHomeButton(){
        BrowserUtils.clickWithJS(homeButton);
    }

    public void verifyOnHomePage(){
        String expected = Driver.get().getCurrentUrl();
        String actual = "https://automationexercise.com/";
        Assert.assertEquals(expected,actual);
    }
}
