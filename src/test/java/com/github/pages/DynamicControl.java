package com.github.pages;

import com.github.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControl {


    @FindBy(xpath = "//p[@id='message']")
    public WebElement loadingMessage;

    @FindBy(xpath = "//*[.='Remove']" )
    public WebElement removeButton;

    @FindBy(xpath = "//*[.='Add']")
    public WebElement addButton;

    @FindBy(xpath = "//*[@id='checkbox']")
    public WebElement checkBox;

    @FindBy(xpath = "(//p)[2]")
    public WebElement message;

    @FindBy(xpath = "//*[.='Enable']")
    public WebElement enableButton;

    @FindBy(xpath = "//*[.='Disable']")
    public WebElement disableButton;

    public DynamicControl(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
}
