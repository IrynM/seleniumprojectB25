package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {
//        TC#3: Google search
//        1- Open a chrome browser
        WebDriverManager.chromedriver().setup(); // checks for the latest version of the specified WebDriver binary
        WebDriver driver = new ChromeDriver();// open brawser
        driver.manage().window().maximize(); // max browser


//        2- Go to: https://google.com/
        driver.get("https://google.com");  // get to google

//        3- Write “apple” in search box
//     4- Press Enter using Keys.ENTER
        WebElement googleSearchBox = driver.findElement(By.name("q"));  // find serch box yto be able to type there
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);// this will type apple to search box and hit the enter to search


//        5- Verify title:
//        Expected: Title should start with “apple” word
         String axpectedInTitle = "apple";   // that what we want to see
         String actualInTitle = driver.getTitle();  // what is there for real

         if(actualInTitle.startsWith(axpectedInTitle)){   // if its true that it will print pass/fail
             System.out.println("Title verification PAssed");
         }else {
             System.out.println("Title verefication FAiled ");
         }







    }
}
