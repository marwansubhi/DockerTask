package com.github.step_definitions;

import com.github.pages.DynamicLoading;
import com.github.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

public class DynamicLoading_StepDefinitions {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
    DynamicLoading dl = new DynamicLoading();

    @Test
    public void test() throws AWTException {

        //Dynamic Loading
        //
        //Test clicks the start button and uses explicit wait.
        //Test asserts that “Hello World!” text is displayed.


        Driver.getDriver().get("http://localhost:7080/dynamic_loading/2");
        dl.startButton.click();
        wait.until(ExpectedConditions.visibilityOf(dl.helloWorld));
        Assert.assertTrue(dl.helloWorld.getText().equals("Hello World!"));




    }
}
