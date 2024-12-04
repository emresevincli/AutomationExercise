package com.automationexercise.step_Defs;

import com.automationexercise.pages.HomePage;
import io.cucumber.java.en.*;

public class HomePage_StepDefs {

    HomePage homePage = new HomePage();

    @When("The user scrolls down to footer")
    public void the_user_scrolls_down_to_footer() {

        homePage.scrollDownToFooter();

    }

    @Then("The user verifies text SUBSCRIPTION")
    public void theUserVerifiesTextSUBSCRIPTION() {

        homePage.subscriptionTextIsVisible();

    }


    @When("The user enters {string} address in input and click arrow button")
    public void theUserEntersAddressInInputAndClickArrowButton(String email) throws InterruptedException {

        homePage.subscription(email);

    }

    @Then("Verify success message {string} is visible")
    public void verifySuccessMessageIsVisible(String expectedMessage) {

        homePage.verifySuccessMessage(expectedMessage);
    }
}
