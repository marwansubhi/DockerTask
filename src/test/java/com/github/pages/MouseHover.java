package com.github.pages;

import com.github.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MouseHover {

    @FindBy(xpath = "(//img)[2]")
    public WebElement firstImage;

    @FindBy(xpath = "(//img)[3]")
    public WebElement secondImage;

    @FindBy(xpath = "(//img)[4]")
    public WebElement thirdImage;

    @FindBy(xpath = "//*[.='name: user1']")
    public WebElement firstText;

    @FindBy(xpath = "//*[.='name: user2']")
    public WebElement secondText;

    @FindBy(xpath = "//*[.='name: user3']")
    public WebElement thirdText;


    public MouseHover(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


}
