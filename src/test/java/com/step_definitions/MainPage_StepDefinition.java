package com.step_definitions;

import com.Pages.LoginPage;
import com.Pages.MainPage;
import com.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class MainPage_StepDefinition {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Given("Enter the valid credentials to login into DVNGL")
    public void enter_the_valid_credentials_to_login_into_DVNGL() {
        loginPage.signin.click();
        loginPage.email.sendKeys(ConfigurationReader.get("email"));
        loginPage.password.sendKeys(ConfigurationReader.get("password"), Keys.ENTER);
    }

    @And("Click on Marketplace on the Dashboard")
    public void click_on_Marketplace_on_the_Dashboard() {
        //mainPage.retryLogin.click();
        mainPage.marketplace.click();

    }

    @When("Select the CyberSecurity checkbox print the number of results")
    public void select_the_CyberSecurity_checkbox_print_the_number_of_results() throws InterruptedException {
        mainPage.cyberSecurity.click();
        System.out.println(mainPage.result.getText());
    }

    @And("Select the Network Storm and click on see prices and buy")
    public void select_the_Network_Storm_and_click_on_see_prices_and_buy() {
        mainPage.networkStorm.click();
        mainPage.seePrices.click();
    }

    @And("From the Single user section see the price and click on buy now then click I accept")
    public void from_the_Single_user_section_see_the_price_and_click_on_buy_now_then_click_I_accept() {
        mainPage.buyNow.click();
        mainPage.accept.click();

    }

    @Then("Verify that the price has been seen on the screen and email address has a warning message")
    public void verify_that_the_price_has_been_seen_on_the_screen_and_email_address_has_a_warning_message() {
        Assert.assertTrue(mainPage.warningMessage.isDisplayed());
        Assert.assertTrue(!mainPage.warningMessage.getText().isEmpty());
        Assert.assertTrue(mainPage.priceTag.isDisplayed());

    }
}
