package com.automationexercise.pages;

import com.automationexercise.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class BasePage {



    public BasePage() {
        PageFactory.initElements(Driver.get(),this);
    }

    Select select;
    Alert alert;
    JavascriptExecutor js;

    public static String generateRandomEmail() {
        String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder username = new StringBuilder();

        for (int i = 0; i < 10; i++) { // 10 karakter uzunluğunda kullanıcı adı
            username.append(chars.charAt(random.nextInt(chars.length())));
        }

        String[] domains = {"gmail.com", "yahoo.com", "outlook.com"};
        String domain = domains[random.nextInt(domains.length)];

        return username + "@" + domain; // Tam e-posta adresi
    }



}
