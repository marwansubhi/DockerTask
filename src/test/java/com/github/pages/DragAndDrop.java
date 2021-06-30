package com.github.pages;

import com.github.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDrop {

    @FindBy(xpath = "(//*[@id='columns']/div)[1]")
    public WebElement boxA;

    @FindBy(xpath = "(//*[@id='columns']/div)[2]")
    public WebElement boxB;

    public DragAndDrop(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
