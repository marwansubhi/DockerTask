package com.github.pages;

import com.github.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowHandle {

    @FindBy(xpath = "//*[@href='/windows/new']")
    public WebElement clickButton;

    @FindBy(xpath = "(//*[.='New Window'])[2]")
    public WebElement newWindow;

    public WindowHandle(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
