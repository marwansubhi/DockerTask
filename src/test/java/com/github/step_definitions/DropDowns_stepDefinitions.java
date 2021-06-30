package com.github.step_definitions;

import com.github.pages.DropDowns;
import com.github.utilities.BrowserUtils;
import com.github.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.Select;

public class DropDowns_stepDefinitions {

    DropDowns dropDowns = new DropDowns();
    @Test
    public void test(){

        //Dropdown
        //
        //Test selects Option 1 and Option 2 from the drop down menu.
        //Test asserts Option 1 and Option 2 are selected.

        Driver.getDriver().get("http://localhost:7080/dropdown");

        Select select = new Select(dropDowns.select);

        select.selectByIndex(1);
        Assert.assertTrue(dropDowns.option1.isSelected());
        BrowserUtils.wait(2);
        select.selectByIndex(2);
        Assert.assertTrue(dropDowns.option2.isSelected());
    }
}
