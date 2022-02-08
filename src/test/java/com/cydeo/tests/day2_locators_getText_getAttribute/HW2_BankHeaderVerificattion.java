package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2_BankHeaderVerificattion {
    public static void main(String[] args) {

//        TC #2: Zero Bank header verification
//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();


//        2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        WebElement headerText = driver.findElement(By.tagName("h3"));

//        3. Verify header text
//        Expected: “Log in to ZeroBank”
        String expectedHeader = "Log in to ZeroBank";
        String actualHeader = headerText.getText();

        if (expectedHeader.equals(actualHeader)){
            System.out.println("Header verification is PASSED!");
        }else{
            System.out.println("Header Verification is FAILED!!!");
        }
    }
}
