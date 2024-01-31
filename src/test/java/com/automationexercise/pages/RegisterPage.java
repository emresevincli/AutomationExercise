package com.automationexercise.pages;

import com.automationexercise.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage{

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    private WebElement nameInputBox;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    private WebElement emailInputBox;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    private WebElement signUpButton;
    @FindBy(xpath = "//b[text()='Enter Account Information']")
    private WebElement enterAccInfoText;
    @FindBy(id = "id_gender1")
    private WebElement titleCheckBox;
    @FindBy(id = "password")
    private WebElement passwordInputBox;
    @FindBy(id = "days")
    private WebElement daysBox;
    @FindBy(id = "months")
    private WebElement monthsBox;
    @FindBy(id = "years")
    private WebElement yearsBox;
    @FindBy(xpath = "//label[text()='Sign up for our newsletter!']")
    private WebElement checkBoxFirst;
    @FindBy(xpath = "//label[text()='Receive special offers from our partners!']")
    private WebElement checkBoxSecond;
    @FindBy(id = "first_name")
    private WebElement firstNameInputBox;
    @FindBy(id = "last_name")
    private WebElement lastNameInputBox;
    @FindBy(id = "company")
    private WebElement companyInputBox;
    @FindBy(id = "address1")
    private WebElement addressInputBoxFirst;
    @FindBy(id = "address2")
    private WebElement addressInputBoxSecond;
    @FindBy(id = "country")
    private WebElement countrySelectBox;
    @FindBy(id = "state")
    private WebElement stateInputBox;
    @FindBy(id = "city")
    private WebElement cityInputBox;
    @FindBy(id = "zipcode")
    private WebElement zipcodeInputBox;
    @FindBy(id = "mobile_number")
    private WebElement mobileNumberInputBox;
    @FindBy(xpath = "//button[@data-qa='create-account']")
    private WebElement createAccountButton;
    @FindBy(xpath = "//b[text()='Account Created!']")
    private WebElement accountCreText;




    public void signUp(String name, String emailAddress){
        nameInputBox.sendKeys(name);
        emailInputBox.sendKeys(emailAddress);
        BrowserUtils.clickWithJS(signUpButton);
    }

    public void verifySignUpText(){
        String expectedMessage = enterAccInfoText.getText();
        String actualMessage ="ENTER ACCOUNT INFORMATION";
        Assert.assertEquals(expectedMessage,actualMessage);

    }

    public void registerInfo(String password){
        BrowserUtils.clickWithJS(titleCheckBox);
        passwordInputBox.sendKeys(password);
        select = new Select(daysBox);
        select.selectByIndex(4);
        select = new Select(monthsBox);
        select.selectByIndex(5);
        select = new Select(yearsBox);
        select.selectByValue("1992");

    }

    public void clickCheckBoxes(){
        BrowserUtils.clickWithJS(checkBoxFirst);
        BrowserUtils.clickWithJS(checkBoxSecond);
    }

    public void registerInfo2(String firstName, String lastName, String company, String address1, String address2, String state, String city, String zipCode, String phoneNumber){
        firstNameInputBox.sendKeys(firstName);
        lastNameInputBox.sendKeys(lastName);
        companyInputBox.sendKeys(company);
        addressInputBoxFirst.sendKeys(address1);
        addressInputBoxSecond.sendKeys(address2);
        select = new Select(countrySelectBox);
        select.selectByIndex(2);
        stateInputBox.sendKeys(state);
        cityInputBox.sendKeys(city);
        zipcodeInputBox.sendKeys(zipCode);
        mobileNumberInputBox.sendKeys(phoneNumber);
        BrowserUtils.clickWithJS(createAccountButton);

    }

    public void accountCreatedVerify(){
        String expected = accountCreText.getText();
        String actual = "ACCOUNT CREATED!";
        Assert.assertEquals(expected,actual);
    }

}
