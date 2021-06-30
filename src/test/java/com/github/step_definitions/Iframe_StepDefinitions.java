package com.github.step_definitions;

import com.github.pages.Iframe;
import com.github.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Iframe_StepDefinitions {

    Iframe frame = new Iframe();
    @Test
    public void test(){

        //Iframe
        //
        //Test switches to Iframe and types some text.
        //Test asserts that the typed text is as expected.


        Driver.getDriver().get("http://localhost:7080/iframe");

        Driver.getDriver().switchTo().frame(frame.childFrame);


        String text = " Hello World";
        frame.body.sendKeys(text);
        System.out.println(frame.body.getText());
       Assert.assertTrue( frame.body.getText().equals("Your content goes here."+text));




    }
}
