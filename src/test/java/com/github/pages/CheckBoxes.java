package com.github.pages;

import com.github.utilities.BrowserUtils;
import com.github.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxes {

    @FindBy(xpath = "(//*[@id='checkboxes']/input)[1]")
    public WebElement checkBox1;

    @FindBy(xpath = "(//*[@id='checkboxes']/input)[2]")
    public WebElement checkBox2;

    public CheckBoxes(){

        PageFactory.initElements(Driver.getDriver(),this);
    }




}
