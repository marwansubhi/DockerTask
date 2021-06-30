package com.github.pages;

import com.github.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='username']")
    public WebElement usernameBox;


    @FindBy(id = "password")
    public WebElement passwordBox;


    @FindBy(xpath = "//*[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//h2")
    public WebElement secureAreaTest;

    @FindBy(xpath = "//*[@id='flash-messages']/div")
    public WebElement errorMessage;

    public void login(String username, String password){
        this.usernameBox.sendKeys(username);
        this.passwordBox.sendKeys(password);
        this.loginButton.click();
    }

}
