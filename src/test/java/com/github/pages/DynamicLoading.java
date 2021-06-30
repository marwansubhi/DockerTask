package com.github.pages;

import com.github.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoading {
    @FindBy(xpath = "//*[.='Start']")
    public WebElement startButton;

    @FindBy(xpath = "//*[.='Hello World!']/h4")
    public WebElement helloWorld;

    public DynamicLoading(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

}
