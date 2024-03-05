package com.automationexercise.step_Defs;

import com.automationexercise.pages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Products_StepDefs {

    ProductsPage productsPage = new ProductsPage();

    @When("The user click on Products button")
    public void the_user_click_on_products_button() {

        productsPage.clickProducts();
    }
    @Then("The user verifies user is navigated to ALL PRODUCTS page successfully")
    public void the_user_verifies_user_is_navigated_to_all_products_page_successfully() {

        productsPage.verifyAllProducts();
    }
    @And("The products list is visible")
    public void the_products_list_is_visible() {

        productsPage.allProductsIsVisible();
    }
    @When("The user click on View Product of first product")
    public void the_user_click_on_view_product_of_first_product() {

        productsPage.clickFirstProduct();
    }
    @And("The user is landed to product detail page")
    public void the_user_is_landed_to_product_detail_page() {

        productsPage.firstProductDetailPage();
    }
    @Then("The user verifies that detail detail is visible: product name, category, price, availability, condition, brand")
    public void the_user_verifies_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {

        productsPage.detailsAreVisible();
    }

}
