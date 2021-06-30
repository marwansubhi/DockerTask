package com.github.step_definitions;

import com.github.pages.JSAlerts;
import com.github.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

public class JSAlerts_StepDefinitions {

    JSAlerts jsAlerts = new JSAlerts();

    @Test
    public void test() {

        //JavaScript Alerts
        //
        //Test Clicks on JS Alert Button.
        //Test asserts alert message.
        //Test clicks on JS confirm Button and clicks ok on alert.
        //Test asserts the alert message.
        //Test clicks on JS Prompt Button and types a message on Prompt.
        //Test asserts that the alert message contains the typed message.


        Driver.getDriver().get("http://localhost:7080/javascript_alerts");

        jsAlerts.jsAlert.click();

        Alert alert = Driver.getDriver().switchTo().alert();

        String alertText = alert.getText();
        Assert.assertTrue(alertText.equals("I am a JS Alert"));
        alert.accept();

        jsAlerts.jsConfirm.click();

        String confirmText = alert.getText();
        Assert.assertTrue(confirmText.equals("I am a JS Confirm"));
        alert.accept();

        jsAlerts.jsPrompt.click();
        String text ="Hello World";
        alert.sendKeys(text);
        alert.accept();

        Assert.assertTrue(jsAlerts.result.getText().endsWith(text));
        System.out.println(jsAlerts.result.getText());



    }
}
