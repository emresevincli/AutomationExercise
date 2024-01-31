package com.automationexercise.step_Defs;

import com.automationexercise.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();

    @Then("The user verifies Login to your account is visible")
    public void the_user_verifies_login_to_your_account_is_visible() {

        loginPage.loginTextIsVisible();
    }
    @When("The user should able to enter correct email and password")
    public void the_user_should_able_to_enter_correct_email_and_password() {

        loginPage.login();
    }
    @Then("The user verifies that Logged in as username is visible")
    public void the_user_verifies_that_logged_in_as_username_is_visible() {

        loginPage.loggedText();
    }

    @When("The user should be able to click Delete Account button")
    public void the_user_should_be_able_to_click_delete_account_button() {

        loginPage.deleteAccount();
    }
    @Then("The user verifies that ACCOUNT DELETED! is visible")
    public void the_user_verifies_that_account_deleted_is_visible() {

        loginPage.deleteAccountText();
    }

    @When("The user should able to enter incorrect {string} and {string}")
    public void the_user_should_able_to_enter_incorrect_and(String email, String password) {

        loginPage.login(email, password);
    }
    @Then("The user verifies thar error message")
    public void the_user_verifies_thar_error_message() {

        loginPage.errorMessage();
    }
}
