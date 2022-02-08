package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTest_Practice {
    public static void main(String[] args) {

        // TC #3: Back and forth navigation
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();// this always need to be created in beginning
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");

        //3- Click to A/B Testing from top of the list.
        //Thread.sleep(3000)   - if you want to slow down process
        //driver.findElement(By.linkText("A/B Testing")).click();
        WebElement abTesting = driver.findElement(By.linkText("A/B Testing"));
        abTesting.click();


        //4- Verify title is:
        //Expected: No A/B Test
        String expectedTitle = "No A/B Testing";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Titleverification FAILS!!!");
        }


        //5- Go back to home page by using the .back();
        driver.navigate().back();


        //6- Verify title equals:
        //Expected: Practice
        expectedTitle = "Practice";
        actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification test passed");
        } else {
            System.out.println(" Title verification test fails");
        }
    }
}
