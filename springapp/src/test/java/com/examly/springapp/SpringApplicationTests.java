package com.examly.springapp;

 

import org.testng.annotations.Test;

import java.net.URL;

 

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.BeforeTest;

import org.testng.Assert;

import org.testng.annotations.AfterTest;

 

public class SpringApplicationTests {

 

    ChromeOptions chromeOptions = new ChromeOptions();

    WebDriver driver = null;

 

    @BeforeTest

    public void beforeTest() throws Exception

     {

        //replace the URL with your selenium instance URL

        driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);

        driver.manage().window().maximize();

    }

 

    @AfterTest

    public void afterTest()

    {

        driver.quit();

    }

 

}