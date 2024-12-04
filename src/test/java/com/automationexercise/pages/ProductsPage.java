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

    @FindBy (xpath = "//input[@id='search_product']")
    private WebElement allProductsSearchBox;

    @FindBy (xpath = "//button[@id='submit_search']")
    private WebElement allProductsSearchButton;

    @FindBy (xpath = "//div[@class='productinfo text-center']//p[contains(text(),'Men Tshirt')]")
    private WebElement tShirtProduct1;

    @FindBy (xpath = "//div[@class='features_items']")
    private WebElement allSearchedProducts;


    /**
     * Clicks on the Products button using JavaScript.
     * This method is used to navigate to the Products page.
     *
     * The method uses BrowserUtils.clickWithJS() instead of a regular click
     * to ensure the element is clicked even if it's not immediately clickable
     * due to overlay or other issues.
     */
    public void clickProducts(){
        BrowserUtils.clickWithJS(productsBtn);
    }

    /**
     * Verifies that the "ALL PRODUCTS" text is displayed correctly on the page.
     *
     * This method compares the expected text "ALL PRODUCTS" with the actual text
     * retrieved from the allProductsText WebElement. It uses JUnit's Assert.assertEquals
     * to perform the comparison.
     *
     * @throws AssertionError if the actual text does not match the expected text
     */
    public void verifyAllProducts(){

        String expected = "ALL PRODUCTS";
        String actual = allProductsText.getText();

        Assert.assertEquals(expected, actual);
    }

    /**
     * Verifies that the list of all products is visible on the page.
     *
     * This method checks if the WebElement representing the list of all products
     * is displayed on the page. It uses JUnit's Assert.assertTrue to perform the verification.
     *
     * @throws AssertionError if the list of all products is not displayed
     */
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

    public void productSearch(){

        allProductsSearchBox.sendKeys("Tshirt");
        BrowserUtils.clickWithJS(allProductsSearchButton);

    }

    /**
     * Verifies that the searched product is visible on the page.
     * This method checks if the actual product name matches the expected product name.
     *
     * The method retrieves the text of the 'tShirtProduct1' WebElement and compares it
     * with the expected product name "Men Tshirt" using JUnit's Assert.assertEquals.
     *
     * @throws AssertionError if the actual product name does not match the expected product name
     */
    public void searchedProductIsVisible(){

        String actualProductName = tShirtProduct1.getText();
        String expectedProductName = "Men Tshirt";
        Assert.assertEquals(actualProductName,expectedProductName);

    }

    public void allSearchedProductsIsVisible(){

        Assert.assertTrue(allSearchedProducts.isDisplayed());
    }

}
