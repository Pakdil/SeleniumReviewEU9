package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T1_Registration_Form {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
//        driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void registration_form_test() {

//        TC#1: Registration form confirmation
//        Note: Use JavaFaker OR read from configuration.properties file when possible.
//        1. Open browser
//        2. Go to website: https://practice.cydeo.com/registration_form
       // driver.get("https://practice.cydeo.com/registration_form");
        //Driver.getDriver() --> driver.get(url)
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        //Create JavaFaker object
        Faker faker = new Faker();
//        3. Enter first name
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys(faker.name().firstName());


//       4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));

        String fakerLastName = faker.name().lastName();
        inputLastName.sendKeys(fakerLastName);

//        5. Enter username
        WebElement inputUserName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));

        String user = faker.bothify("helpdesk###");
        //inputUserName.sendKeys(faker.name().username());
        inputUserName.sendKeys(user);

//        6. Enter email address
        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(user + "@email.com");

//        7. Enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(faker.numerify("########"));
        //inputPassword.sendKeys(faker.internet().password());

//        8. Enter phone number
        WebElement inputPhone = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhone.sendKeys(faker.numerify("###-###-####"));

//        9. Select a gender from radio buttons
        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();

//        10. Enter date of birth
        WebElement inputBirthday = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
//faker.number().numberBetween(2004, 1920)
        inputBirthday.sendKeys("03/08/1990");

//        11. Select Department/Office
        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("department")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));

//        12. Select Job Title
//        13. Select programming language from checkboxes
//        14. Click to sign up button
//        15. Verify success message “You’ve successfully completed registration.” is
//        displayed.
    }
}
