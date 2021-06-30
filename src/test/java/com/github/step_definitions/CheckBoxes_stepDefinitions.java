package com.github.step_definitions;

import com.github.pages.CheckBoxes;
import com.github.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CheckBoxes_stepDefinitions {

    CheckBoxes checkBoxes = new CheckBoxes();

    @Given("user on the check boxes page")
    public void user_on_the_check_boxes_page() {

        Driver.getDriver().get("http://localhost:7080/checkboxes ");
    }

    @When("user check the checkboxes")
    public void user_check_the_checkboxes() {

        checkBoxes.checkBox1.click();

        checkBoxes.checkBox2.click();


    }

    @Then("check boxes should be checked")
    public void check_boxes_should_be_checked() {

        assertTrue(checkBoxes.checkBox1.isSelected());
        assertFalse(checkBoxes.checkBox2.isSelected());


    }

}