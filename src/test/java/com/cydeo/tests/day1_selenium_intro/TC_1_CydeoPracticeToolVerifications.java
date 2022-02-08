package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_1_CydeoPracticeToolVerifications {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();

        //Make our page fullscreen
        driver.manage().window().maximize();

        //2. Go to https://www.practice.cydeo.com
        driver.get("https://practice.cydeo.com");

        //3. Verify URL:
        //contains: CYDEO
        String expectedUrl = "cydeo";
        driver.getCurrentUrl();
        String currentUrl = driver.getCurrentUrl();

        //4. VerifY title:
        //actual title comes from the browser
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (currentUrl.contains(expectedUrl)) {
            System.out.println("URL contains cydeo");
        } else {
            System.out.println("URL failed!");
        }
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title matched");
        } else {
            System.out.println("Title didn't matched");
        }
        driver.quit();

    }
}

