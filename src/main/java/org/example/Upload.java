package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload {

    public static void main(String[] args) {


        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rushi\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        // maximize the window
        driver.manage().window().maximize();
        WebElement upload = driver.findElement(By.xpath("//input[@name = 'upload']"));
        upload.sendKeys("E:\\Others\\22.jpg");

    }
}
