package com.github.pages;

import com.github.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicContent {

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[2]")
    public WebElement text1;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]")
    public WebElement text2;
    @FindBy(xpath = "//*[@id=\"content\"]/div[3]/div[2]")
    public WebElement text3;

    public DynamicContent(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


}
