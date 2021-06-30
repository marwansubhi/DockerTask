package com.github.step_definitions;

import com.github.pages.DragAndDrop;
import com.github.utilities.BrowserUtils;
import com.github.utilities.Driver;

import static org.junit.Assert.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class DragAndDrop_StepDefinitions {


    DragAndDrop dragAndDrop = new DragAndDrop();


    @Test
    public void dragAndDrop() {

        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        Actions actions = new Actions(Driver.getDriver());

        WebElement dragA = Driver.getDriver().findElement(By.xpath("//*[@id='draggable']"));
        WebElement dragB = Driver.getDriver().findElement(By.xpath("//*[@id='droptarget']"));

        actions.dragAndDrop(dragA,dragB).build().perform();


    }

    @Test
    public void dragAndDrop2(){
        Driver.getDriver().get("http://localhost:7080/drag_and_drop");
        BrowserUtils.wait(2);

       Actions a = new Actions(Driver.getDriver());
        BrowserUtils.wait(2);
       a.clickAndHold(dragAndDrop.boxA).pause(3).moveToElement(Driver.getDriver().findElement(By.id("column-b"))).release().build().perform();


    }
}
