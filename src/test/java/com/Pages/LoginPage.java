package com.Pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() { PageFactory.initElements(Driver.get(), this); }

    @FindBy(xpath = "//a[@title='Sign in to Veracity']")
    public WebElement signin;

    @FindBy(id = "userNameInput")
    public WebElement email;

    @FindBy(id = "passwordInput")
    public WebElement password;



}
