package com.github.step_definitions;

import com.github.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class TextContext {

    @Test
    public void testContext() {

        //Context Menu
        //
        //Test right clicks on the context menu.
        //Test asserts the alert menu text.

        Driver.getDriver().get("http://localhost:7080/context_menu");
        WebElement toClick = Driver.getDriver().findElement(By.xpath("//*[@id='hot-spot']"));
        Actions actions = new Actions(Driver.getDriver());

        actions.contextClick(toClick).perform();

        Alert alert = Driver.getDriver().switchTo().alert();

        String expectedTest = "You selected a context menu";
        String actualTest = alert.getText();
        assertEquals(expectedTest, actualTest);
        alert.accept();

        /*
        * Summary:
Actions class in Selenium is mostly used to perform complex keyboard and mouse operations.
*  Hence, Actions class is preferred compared to Javascript for performing operations such as Right Click and Double Click in Selenium.
Right click operation is mostly used when performing right click on an element opens a new menu.
* Right click operation in Selenium web driver can be done using the pre defined command Context Click as mentioned below
Actions action = new Actions(driver);
WebElement link = driver.findElement(By.ID ("Element ID"));
action.contextClick(link).perform();
*
*
Double click operation is used when the state of web element changes after double click operation.
* Double Click operation in Selenium web driver can be done using the pre defined command Double Click as mentioned below
Actions action = new Actions(driver);
WebElement link = driver.findElement(By.ID ("Element ID"));
action. doubleClick (link).perform();
        * */
    }
}
