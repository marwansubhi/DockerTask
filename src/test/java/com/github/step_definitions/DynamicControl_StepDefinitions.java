package com.github.step_definitions;

import com.github.pages.DynamicControl;
import com.github.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicControl_StepDefinitions {
    DynamicControl dynamicControl = new DynamicControl();
//Dynamic Controls
    //
    //Test clicks on the Remove Button and uses explicit wait.
    //Test asserts that the checkbox is gone.
    //Test clicks on Add Button and uses explicit wait.
    //Test asserts that the checkbox is present.
    //Test clicks on the Enable Button and uses explicit wait.
    //Test asserts that the text box is enabled.
    //Test clicks on the Disable Button and uses explicit wait.
    //Test asserts that the text box is disabled.

    @Test

    public void test() {

        Driver.getDriver().get("http://localhost:7080/dynamic_controls");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        dynamicControl.removeButton.click();

        wait.until(ExpectedConditions.visibilityOf(dynamicControl.loadingMessage));

        Assert.assertTrue(dynamicControl.loadingMessage.isDisplayed());

        dynamicControl.addButton.click();
        wait.until(ExpectedConditions.visibilityOf(dynamicControl.checkBox));

        Assert.assertTrue(dynamicControl.checkBox.isDisplayed());

        dynamicControl.enableButton.click();

        wait.until(ExpectedConditions.visibilityOf(dynamicControl.message));

        Assert.assertTrue(dynamicControl.message.getText().equals("It's enabled!"));


        dynamicControl.disableButton.click();
        wait.until(ExpectedConditions.visibilityOf(dynamicControl.message));
        Assert.assertTrue(dynamicControl.message.getText().equals("It's disabled!"));


    }
}
