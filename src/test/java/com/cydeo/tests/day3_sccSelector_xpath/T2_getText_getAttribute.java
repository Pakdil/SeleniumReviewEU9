package com.cydeo.tests.day3_sccSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {
        //    TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
//1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

//            3- Verify “remember me” label text is as expected:
//    Expected: Remember me on this computer
WebElement RememberMeLable = driver.findElement(By.className("login-item-checkbox-label"));

String expectedRememberMeLable = "Remember me on this computer";
String actualRememberMeLable = RememberMeLable.getText();

//4- Verify “forgot password” link text is as expected:
//    Expected: Forgot your password?
//            5- Verify “forgot password” href attribute’s value contains expected:
//    Expected: forgot_password=yes



    }




}
