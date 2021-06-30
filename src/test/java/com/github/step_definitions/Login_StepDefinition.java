package com.github.step_definitions;

import com.github.pages.LoginPage;
import com.github.utilities.ConfigurationReader;
import com.github.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Login_StepDefinition {
    LoginPage loginPage = new LoginPage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get("http://localhost:7080/login");
    }
    @When("user enters valid {string} and {string}")
    public void user_enters_valid_and(String username, String password) {

        username = ConfigurationReader.getProperty("username");
        password = ConfigurationReader.getProperty("password");
        loginPage.login(username,password);


    }
    @Then("user should login successfully")
    public void user_should_login_successfully() {
        String expectedResult = loginPage.secureAreaTest.getText();
        String actualResult = "Secure Area";
        Assert.assertTrue(expectedResult.equals(actualResult));


    }

    @When("user provide invalid {string} and {string}")
    public void user_provide_invalid_and(String username, String password) {
     username = "tomsmfith";
     password = "SuperSecretPassword!";

     loginPage.login(username,password);

    }

    @Then("user should see error message")
    public void user_should_see_error_message() {
        String expectedError = "Your username is invalid!\n" + "×";
        String actualError = loginPage.errorMessage.getText();
        Assert.assertTrue(expectedError.equals(actualError));
    }

}
