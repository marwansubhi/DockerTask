package com.github.pages;

import com.github.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileDownload {

    @FindBy(xpath = "//*[@href='download/some-file.txt']")
    public WebElement file;

    public FileDownload(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
}
