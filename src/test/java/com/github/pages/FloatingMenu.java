package com.github.pages;

import com.github.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FloatingMenu {

    @FindBy(xpath = "//*[@id='menu']")
    public WebElement menu;

    @FindBy(xpath = "(//*[.='Home'])[2]")
    public WebElement home;

    @FindBy(xpath = "(//*[.='News'])[2]")
    public WebElement news;

    @FindBy(xpath = "(//*[.='Contact'])[2]")
    public WebElement contact;

    @FindBy(xpath = "(//*[.='About'])[2]")
    public WebElement about;

    public FloatingMenu(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
}
