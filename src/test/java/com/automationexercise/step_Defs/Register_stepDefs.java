package com.automationexercise.step_Defs;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.RegisterPage;
import com.automationexercise.utilities.ConfigurationReader;
import com.automationexercise.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register_stepDefs {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Given("The user should able to open launch browser")
    public void the_user_should_able_to_open_launch_browser() {

    }

    @When("The user navigate to url")
    public void the_user_navigate_to_url() {

        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Then("The user verifies that the home page is visible")
    public void the_user_verifies_that_the_home_page_is_visible() {

        homePage.homePageIsVisible();
    }

    @When("The user click on Signup Login button")
    public void the_user_click_on_signup_login_button() {

        homePage.clickLoginButton();
    }
    @Then("The user verifies New User Signup! is visible")
    public void the_user_verifies_new_user_signup_is_visible() {

        homePage.signUpTextIsVisible();
    }

    @When("The user should be able to enter {string} and {string} and click Signup button")
    public void the_user_should_be_able_to_enter_and_and_click_Signup_button(String name, String emailAddress) {

        registerPage.signUp(name, emailAddress);

    }

    @Then("The user verifies that Enter Account Information is visible")
    public void the_user_verifies_that_enter_account_information_is_visible() {

        registerPage.verifySignUpText();
    }

    @When("The user is should be able to enter title {string} dateOfBirth")
    public void the_user_is_should_be_able_to_enter_title_date_of_birth(String password) {
        registerPage.registerInfo(password);
    }
    @When("The user should be able to select checkboxes")
    public void the_user_should_be_able_to_select_checkboxes() {
        registerPage.clickCheckBoxes();
    }
    @When("The user should be able to enter {string} {string} {string} {string} {string}{string} {string} {string} {string} and click Create Account button")
    public void the_user_should_be_able_to_enter_and_click_create_account_button(String firstName, String lastName, String company, String address1, String address2, String state, String city, String zipCode, String phoneNumber) {
        registerPage.registerInfo2(firstName, lastName, company, address1, address2, state, city, zipCode, phoneNumber);
    }
    @Then("The user verifies that ACCOUNT CREATED! is visible")
    public void the_user_verifies_that_account_created_is_visible() {
        registerPage.accountCreatedVerify();
    }

    @When("The user should enter name and currently registered email address and click Signup button")
    public void the_user_should_enter_name_and_currently_registered_email_address_and_click_signup_button() {

        registerPage.negativeRegister();
    }
    @Then("The user verifies already Registered Message")
    public void the_user_verifies_already_registered_message() {

        registerPage.alreadyRegisteredMessage();
    }


}
