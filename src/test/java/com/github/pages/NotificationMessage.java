package com.github.pages;

import com.github.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotificationMessage {

    @FindBy(linkText = "Click here")
    public WebElement clickLink;

    @FindBy(id = "flash")
    public WebElement flash;

    public NotificationMessage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
