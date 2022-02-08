package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3_BackANDForthNavigation {
    public static void main(String[] args) {
//        TC #3: Back and forth navigation
//        1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

//        2- Go to: https://google.com
        driver.get("https://google.com");


//        3- Click to Gmail from top right.
        WebElement email = driver.findElement(By.linkText("Gmail"));
        email.sendKeys(Keys.ENTER);

//        4- Verify title contains:
//        Expected: Gmail

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (expectedTitle.contains(actualTitle)){
            System.out.println("Title Verification PASSED!");
        }else{
            System.out.println("Title Verification FAILED!!!");
        }



//        5- Go back to Google by using the .back();
        driver.navigate().back();


//        6- Verify title equals:
//        Expected: Google


        String expectedTitleG = "Google ";
        String actualTitleG = driver.getTitle();

        if (actualTitleG.equals(expectedTitleG)){
            System.out.println("Title Verification PASSED!");
        }else{
            System.out.println("Title Verification FAILED!!!");
        }

        driver.close();



    }
}
