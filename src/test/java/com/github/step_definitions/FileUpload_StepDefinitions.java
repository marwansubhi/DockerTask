package com.github.step_definitions;

import com.github.pages.FileUpload;
import com.github.utilities.BrowserUtils;
import com.github.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload_StepDefinitions {

    FileUpload fileUpload = new FileUpload();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    @Test
    public void test(){

        //File Upload
        //
        //Test uses Upload Button or Drag and Drop to upload a file.
        //Test asserts that the file is uploaded.
        String filePath = "C:\\Users\\Owner\\Downloads\\toUpload.txt";

        Driver.getDriver().get("http://localhost:7080/upload");

        fileUpload.chooseFileButton.sendKeys(filePath);
        BrowserUtils.wait(3);
        fileUpload.uploadButton.click();

        Assert.assertTrue(fileUpload.fileUploaded.isDisplayed());
        Assert.assertTrue(fileUpload.fileUploaded.getText().equals("File Uploaded!"));
        System.out.println(fileUpload.fileUploaded.getText());


    }
}
