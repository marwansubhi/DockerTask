package com.github.step_definitions;

import com.github.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before(order = 2)
    public void setUpScenario() {
        System.out.println("------Setting up browser with further details...");
    }

    @Before(value = "@db", order = 1)
    public void setUpDatabase() {
        System.out.println("----- CONNECTING TO DATABASE ");
    }

    @After(value = "@db", order = 1)
    public void closeDBConnection() {
        System.out.println("------Closing browser");
        System.out.println("------Take a screenshot");
    }

    @After(order = 2)
    public void tearDownScenario(Scenario scenario) {

        // System.out.println("scenario.getSourceTagNames() = " + scenario.getSourceTagNames());
        // if my scenario failed, go and take a screen shot
        if (scenario.isFailed()) {

            byte[] screenShots = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShots, "image/png", scenario.getName());

        }

        Driver.closeDriver();
    }

    @BeforeStep
    public void runBeforeSteps() {
        System.out.println("________________Running Before Each STEP ________________");

    }

    @AfterStep
    public void runsAfterSteps() {
        System.out.println("________________Running AFTER Each STEP ________________");
    }

}
