package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {
        //  1- Setup the browser driver
        WebDriverManager.chromedriver().setup();

        // Creat einstance of the driver
        // this line will open empty browser
        WebDriver driver = new ChromeDriver();




        //driver.manage().window().fullscreen();

        //3 - Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        // this will miximize the browser size
        driver.manage().window().maximize();


        //Stop code execution for 3 second
        Thread.sleep(3000);



        //4 use selenium to navigate back
       driver.navigate().back();


        //Stop code execution for 3 second
        Thread.sleep(3000);

        //Driver navigate forward
        driver.navigate().forward();

        // use selenium to navigate refresh
        driver.navigate().refresh();


        Thread.sleep(3000);
        driver.navigate().to("https://www.google.com");


        Thread.sleep(3000);
        //get the title of the page
        driver.getTitle();
        String curantURL =driver.getCurrentUrl();
        String currentTitle = driver.getTitle();
        System.out.println(driver.getTitle() +" Get title of the page");


        System.out.println("currant URL"+curantURL );

        // this will  close the currently open window
driver.close();

        // this will close all the opened windows.
//driver.quit();


    }
}
