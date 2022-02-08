package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1YahooVerification {
    public static void main(String[] args) {

        //Yahoo title Verification

        // do set up fro browser driver
        WebDriverManager.chromedriver().setup();

        //1.Open Chrome browser
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();


        //2.Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");


        //3.Verify title:
        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        String actualTitle = driver.getTitle();


        if(actualTitle.equals(expectedTitle)){
            System.out.println("Verification Passed");
        }else
        {
            System.out.println("verification faled");
        }
        //Expected: Yahoo





    }

}
