package com.github.step_definitions;

import com.github.pages.FileDownload;
import com.github.utilities.BrowserUtils;
import com.github.utilities.ConfigurationReader;
import com.github.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.Arrays;

public class FileDownload_StepDefinitions {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    FileDownload fileDownload = new FileDownload();

    @Test
    public void test() {

        Driver.getDriver().get("http://localhost:7080/download");
        // Driver.getDriver().get("http://demo.automationtesting.in/FileDownload.html");
        String path = "C:\\Users\\Owner\\Downloads\\";
        fileDownload.file.click();
        BrowserUtils.wait(2);
        Assert.assertTrue(isFileDownloaded(path, "some-file.txt"));
        Assert.assertTrue(isFileDownloaded_Ext(path,"txt"));

        String newFile = "C:\\Users\\Owner\\Downloads\\some-file.txt";
        File file = new File(newFile);

        System.out.println(file.exists());
        System.out.println(file.delete());

    }

    /*
    * Below method takes the download directory and the file name,
    * which will check for the file name mention in the directory and will return 'True' if the document is available in the folder else 'false'.
    * When we are sure of the file name, we can make use of this method to verify.
    * */
    public boolean isFileDownloaded(String downloadPath, String fileName) {
        boolean flag = false;
        File dir = new File(downloadPath);
        File[] dir_contents = dir.listFiles();

        for (int i = 0; i < dir_contents.length; i++) {
            if (dir_contents[i].getName().equals(fileName)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    /*
    * The below method takes two parameters, first takes the folder path and the file extension / mime type.
    *  it will return true if the file with the specific extension is available in the specified folder.
    * */
    private boolean isFileDownloaded_Ext(String dirPath, String ext) {
        boolean flag = false;
        File dir = new File(dirPath);
        File[] files = dir.listFiles();
        if (files == null || files.length == 0) {
            flag = false;
        }

        for (int i = 1; i < files.length; i++) {
            if (files[i].getName().endsWith(ext)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
