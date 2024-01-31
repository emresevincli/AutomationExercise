package com.automationexercise.pages;

import com.automationexercise.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(),this);
    }

    Select select;

}
