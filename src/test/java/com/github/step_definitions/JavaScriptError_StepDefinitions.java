package com.github.step_definitions;

import com.github.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.util.List;
import java.util.Set;

public class JavaScriptError_StepDefinitions {

    @Test
    public void test() {


        //JavaScript Error
        //
        //Test finds the JavaScript error on the page.
        //Test asserts that the page contains error: Cannot read property 'xyz' of undefined.


        Driver.getDriver().get("http://localhost:7080/javascript_error");


        LogEntries entries = Driver.getDriver().manage().logs().get(LogType.BROWSER);

        String errorConsoleText = "Cannot read property 'xyz' of undefined";
        Assert.assertTrue(containsJavaScriptError(entries, errorConsoleText));
    }

    public boolean containsJavaScriptError(LogEntries entries, String errorText) {

        boolean flag = false;
        List<LogEntry> list = entries.getAll();
        for (LogEntry logEntry : list) {

            if (logEntry.getMessage().contains(errorText)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
