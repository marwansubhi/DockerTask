package com.github.step_definitions;

import com.github.pages.NotificationMessage;
import com.github.utilities.BrowserUtils;
import com.github.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;

public class NotificationMessage_StepDefinitions {

    NotificationMessage nm = new NotificationMessage();

    @Test
    public void test(){


        //Notification Message
        //
        //Test clicks on the Click Here link a multiple times.
        //Test asserts that one of the “Action Successful”, “Action unsuccessful,
        // please try again” and “Action Unsuccessful” messages show on click.

        Driver.getDriver().get("http://localhost:7080/notification_message_rendered");

        int count = 0;
        while (true){
            BrowserUtils.wait(1);
            nm.clickLink.click();
            if (nm.flash.getText().contains("Action successful")){
              count++;
              break;
            }
        }
        while (true){
            BrowserUtils.wait(1);
            nm.clickLink.click();
            if (nm.flash.getText().contains("Action unsuccesful, please try again")){
                count++;
                break;
            }
        }

       Assert.assertTrue(count==2);
    }
}
