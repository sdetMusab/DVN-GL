package com.Pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(){ PageFactory.initElements(Driver.get(),this); }

    @FindBy(xpath = "//a[.='Retry login']")
    public WebElement retryLogin;

    @FindBy(xpath = "//div[.='Marketplace']")
    public WebElement marketplace;

    @FindBy(xpath = "//label[@for='cyber-security']/span[1]")
    public WebElement cyberSecurity;

    @FindBy(xpath = "//h3[@class='_section-title_115d7']")
    public WebElement result;

    @FindBy(xpath = "//h3[.='Network Storm']")
    public WebElement networkStorm;

    @FindBy(xpath = "//button[.='See prices and buy']")
    public WebElement seePrices;

    @FindBy(xpath = "(//button[.='Buy now'])[1]")
    public WebElement buyNow;

    @FindBy(xpath = "//button[.='I accept']")
    public WebElement accept;

    @FindBy(xpath = "//strong")
    public WebElement warningMessage;

    @FindBy(xpath = "(//table[@class='cas-table']/tbody/tr/td[2])[1]")
    public WebElement priceTag;


}
