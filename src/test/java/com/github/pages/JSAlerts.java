package com.github.pages;

import com.github.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JSAlerts {

    @FindBy(xpath = "//*[@onclick='jsAlert()']")
    public WebElement jsAlert;

    @FindBy(xpath = "//*[@onclick='jsConfirm()']")
    public WebElement jsConfirm;

    @FindBy(xpath = "//*[@onclick='jsPrompt()']")
    public WebElement jsPrompt;


    @FindBy(id = "result")
    public WebElement result;


    public JSAlerts(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
}
