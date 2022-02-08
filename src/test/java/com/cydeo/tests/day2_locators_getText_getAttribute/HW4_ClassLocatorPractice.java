package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW4_ClassLocatorPractice {
    public static void main(String[] args) {

//        TC #4: Practice Cydeo – Class locator practice
//        1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


//        2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");


//        3- Click to “Home” link
        WebElement homeButton = driver.findElement(By.className("nav-link"));
      homeButton.sendKeys(Keys.ENTER);

//        4- Verify title is as expected:
//        Expected: Practice
  String expectedTitle = "Practice"   ;
  String actualTitle = driver.getTitle();

        if (expectedTitle.contains(actualTitle)){
            System.out.println("Title Verification PASSED!");
        }else{
            System.out.println("Title Verification FAILED!!!");
        }
//
//        PS: Locate “Home” link using “className” locator
    }
}
