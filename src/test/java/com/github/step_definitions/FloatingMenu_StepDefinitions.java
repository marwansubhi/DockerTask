package com.github.step_definitions;

import com.github.pages.FloatingMenu;
import com.github.utilities.BrowserUtils;
import com.github.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class FloatingMenu_StepDefinitions {

    FloatingMenu flot = new FloatingMenu();
    @Test
    public void test(){

        //Floating Menu
        //
        //Test scrolls the page.
        //Test asserts that the floating menu is still displayed.



        Driver.getDriver().get("http://localhost:7080/floating_menu");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //Use "js" to reach JavascriptExecutor methods
        //first one is for x axis, second is y axis
        //We are saying, move down 750 pixels using this js function

        //Creating the loop just to scroll 750pixels down 10 times.
        for (int i = 0; i < 5; i++) {

            BrowserUtils.wait(1);
            js.executeScript("window.scrollBy(0, 250)");
            Assert.assertTrue(flot.menu.isDisplayed());

        }

        for (int i = 0; i < 5; i++) {

            BrowserUtils.wait(1);
            js.executeScript("window.scrollBy(0, -250)");
            Assert.assertTrue(flot.menu.isDisplayed());

        }


        js.executeScript("arguments[0].click();", flot.news);
        BrowserUtils.wait(1);
        js.executeScript("arguments[0].click();", flot.about);
        BrowserUtils.wait(1);
        js.executeScript("arguments[0].click();", flot.contact);
        BrowserUtils.wait(1);
        js.executeScript("arguments[0].click();", flot.news);


       // To refresh browser window using Javascript
        js.executeScript("history.go(0)");


        //  To get innertext of the entire webpage in Selenium
        String sText =  js.executeScript("return document.documentElement.innerText;").toString();
        System.out.println(sText);


          //  To get the Title of our webpage
        String sText1 =  js.executeScript("return document.title;").toString();
        System.out.println(sText1);

         // To get the domain
        String sText2 =  js.executeScript("return document.domain;").toString();
        System.out.println(sText2);

         //  To get the URL of a webpage
        String sText3 =  js.executeScript("return document.URL;").toString();
        System.out.println(sText3);


         //  To perform Scroll on an application using  Selenium
        //Vertical scroll - down by 500  pixels
      //  js.executeScript("window.scrollBy(0,500)");
        // for scrolling till the bottom of the page we can use the code like
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

      //  To click on a SubMenu which is only visible on mouse hover on Menu
        //js.executeScript("$('ul.menus.menu-secondary.sf-js-enabled.sub-menu li').hover()");


       // To navigate to a different page using Javascript

       // js.executeScript("window.location = 'https://www.softwaretestingmaterial.com");


        //To find a hidden element in selenium using JavaScriptExecutor
      //  js.executeScript("arguments[0].click();", element);

//        while (true){
//            BrowserUtils.wait(1);
//            js.executeScript("window.scrollBy(0, 250)");
//        }

    }
}
