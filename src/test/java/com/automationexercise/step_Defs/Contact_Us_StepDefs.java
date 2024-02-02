package com.automationexercise.step_Defs;

import com.automationexercise.pages.Contact_UsPage;
import com.automationexercise.pages.HomePage;
import com.automationexercise.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Contact_Us_StepDefs {

    HomePage homePage = new HomePage();
    Contact_UsPage contactUsPage = new Contact_UsPage();

    @When("The user click on Contact Us button")
    public void the_user_click_on_contact_us_button() {
        homePage.clickContactUsButton();
    }
    @Then("The user verifies that GET IN TOUCH message")
    public void the_user_verifies_that_get_in_touch_message() {
        contactUsPage.verifyGetInTouchText();
    }
    @When("The user should be able to enter {string} {string} {string} and {string} upload file and click Submit button")
    public void the_user_should_be_able_to_enter_and_upload_file_and_click_Submit_button(String name, String email, String subject, String message) {
        contactUsPage.contactUsForm(name, email, subject, message);
    }
    @And("The user click on OK button")
    public void the_user_click_on_ok_button() {
        contactUsPage.clickOkButton();
    }
    @Then("The user verifies that success message")
    public void the_user_verifies_that_success_message() {

        contactUsPage.verifySuccessMessage();

    }
    @When("The user click on Home button")
    public void the_user_click_on_home_button() {
        contactUsPage.clickOnHomeButton();
    }
    @Then("The user verifies that landed to home page successfully")
    public void the_user_verifies_that_landed_to_home_page_successfully() {

        contactUsPage.verifyOnHomePage();
    }


}
