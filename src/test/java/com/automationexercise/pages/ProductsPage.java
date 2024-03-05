package com.automationexercise.pages;

import com.automationexercise.utilities.BrowserUtils;
import com.automationexercise.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{


    @FindBy (xpath = "//a[@href='/products']")
    private WebElement productsBtn;

    @FindBy (xpath = "//h2[normalize-space()='All Products']")
    private WebElement allProductsText;

    @FindBy (xpath = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")
    private WebElement firstProduct;

    @FindBy (xpath = "//h2[normalize-space()='Blue Top']")
    private WebElement firstProductName;

    @FindBy (xpath = "//p[normalize-space()='Category: Women > Tops']")
    private WebElement firstProductCategory;

    @FindBy (xpath = "//span[normalize-space()='Rs. 500']")
    private WebElement firstProductPrice;

    @FindBy (xpath = "//b[normalize-space()='Availability:']")
    private WebElement firstProductAvailability;

    @FindBy (xpath = "//b[normalize-space()='Condition:']")
    private WebElement firstProductCondition;

    @FindBy (xpath = "//b[normalize-space()='Brand:']")
    private WebElement firstProductBrand;

    @FindBy (xpath = "//div[@class='features_items']")
    private WebElement allProductsList;


    public void clickProducts(){
        BrowserUtils.clickWithJS(productsBtn);
    }

    public void verifyAllProducts(){

        String expected = "ALL PRODUCTS";
        String actual = allProductsText.getText();

        Assert.assertEquals(expected, actual);
    }

    public void allProductsIsVisible(){

        Assert.assertTrue(allProductsList.isDisplayed());
    }

    public void clickFirstProduct(){

        BrowserUtils.clickWithJS(firstProduct);
    }

    public void firstProductDetailPage(){

        String expectedUrl = "https://automationexercise.com/product_details/1";
        String actualUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void detailsAreVisible(){

        Assert.assertTrue(firstProductName.isDisplayed());
        Assert.assertTrue(firstProductPrice.isDisplayed());
        Assert.assertTrue(firstProductCategory.isDisplayed());
        Assert.assertTrue(firstProductAvailability.isDisplayed());
        Assert.assertTrue(firstProductCondition.isDisplayed());
        Assert.assertTrue(firstProductBrand.isDisplayed());
    }


}
