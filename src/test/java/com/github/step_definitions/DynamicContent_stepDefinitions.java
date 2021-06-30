package com.github.step_definitions;

import com.github.pages.DynamicContent;
import com.github.utilities.Driver;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DynamicContent_stepDefinitions {

    DynamicContent dc = new DynamicContent();

    @Test
    public void test() {

        Driver.getDriver().get("http://localhost:7080/dynamic_content");

        String text1 = dc.text1.getText();
        String text2 = dc.text2.getText();
        String text3 = dc.text3.getText();
        Assert.assertTrue(text1.equals(dc.text1.getText()));
        Assert.assertTrue(text2.equals(dc.text2.getText()));
        Assert.assertTrue(text3.equals(dc.text3.getText()));

        Driver.getDriver().navigate().refresh();
        Assert.assertTrue(text1.equals(dc.text1.getText()));
        Assert.assertTrue(text2.equals(dc.text2.getText()));
        Assert.assertTrue(text3.equals(dc.text3.getText()));



    }
}
