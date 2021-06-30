package com.github.pages;

import com.github.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FileUpload {

    @FindBy(id = "file-upload")
    public WebElement chooseFileButton;

    @FindBy(id = "file-submit")
    public WebElement uploadButton;

    @FindBy(xpath = "//*[.='File Uploaded!']")
    public WebElement fileUploaded;

    public FileUpload(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

}
