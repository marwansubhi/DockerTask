package com.github.pages;

import com.github.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDowns {

    @FindBy(xpath = "//*[@id='dropdown']")
    public WebElement select;

    @FindBy(xpath = "//*[.='Option 1']")
    public WebElement option1;

    @FindBy(xpath = "//*[.='Option 2']")
    public WebElement option2;

    public DropDowns(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
}
