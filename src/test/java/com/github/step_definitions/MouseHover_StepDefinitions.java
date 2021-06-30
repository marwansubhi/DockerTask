package com.github.step_definitions;

import com.github.pages.MouseHover;
import com.github.utilities.BrowserUtils;
import com.github.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.util.List;

public class MouseHover_StepDefinitions {

    MouseHover mouseHover = new MouseHover();

    @Test
    public void test(){

        Driver.getDriver().get("http://localhost:7080/hovers");

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(mouseHover.firstImage).build().perform();
        Assert.assertTrue(mouseHover.firstText.isDisplayed());
        BrowserUtils.wait(2);

        actions.moveToElement(mouseHover.secondImage).build().perform();
        Assert.assertTrue(mouseHover.secondText.isDisplayed());

        BrowserUtils.wait(2);

        actions.moveToElement(mouseHover.thirdImage).build().perform();
        Assert.assertTrue(mouseHover.thirdText.isDisplayed());

        LogEntries entries = Driver.getDriver().manage().logs().get(LogType.BROWSER);

        List<LogEntry> list = entries.getAll();

        for (LogEntry logEntry : list) {
            System.out.println(logEntry);
        }

    }
}
