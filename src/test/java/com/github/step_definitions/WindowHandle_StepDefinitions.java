package com.github.step_definitions;

import com.github.pages.WindowHandle;
import com.github.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

public class WindowHandle_StepDefinitions {

    WindowHandle windowHandle = new WindowHandle();

    @Test
    public void test() {

        //Open in New Tab
        //
        //Test clicks on the Click Here link.
        //Test asserts that a new tab is opened with text New Window.


        Driver.getDriver().get("http://localhost:7080/windows");
        // click the link
        windowHandle.clickButton.click();

        // store the main window handle of the first page
        String mainHandle = Driver.getDriver().getWindowHandle();

        // move to the next window throughout the set that has all the window handles
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();

        for (String eachHandle : windowHandles) {
            Driver.getDriver().switchTo().window(eachHandle);
            System.out.println(Driver.getDriver().getTitle());
        }

        // after moving in forward direction we know for sure that the last window the driver will be landed is the new window
        Assert.assertTrue(Driver.getDriver().getTitle().equals("New Window"));
        Assert.assertTrue(windowHandle.newWindow.isDisplayed());
        Assert.assertTrue(windowHandle.newWindow.getText().equals("New Window"));

        // switch back to the original window after passing the main handle
        Driver.getDriver().switchTo().window(mainHandle);

        // assert that you are back at the original window
        Assert.assertTrue(Driver.getDriver().getTitle().equals("The Internet"));


    }
}
