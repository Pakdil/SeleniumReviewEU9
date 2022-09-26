package com.cydeo.tests.day5_testNG_intro_dropdowns;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Intro {

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("--> BeforeMethod is running!");
    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("--> AfterMethod is running...");
    }

    @Test
    public void test1() {
        System.out.println("Test 1 is running...");
    }

    @Test

    public void test2(){
        System.out.println("Test2 is running...");
    }



}


