package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCMD {
    public static void main( String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        //Navigate to url
        driver.navigate().to("https://www.facebook.com/login/");
        //Navigate back
        driver.navigate().back();
        //Refresh
        driver.navigate().refresh();
        //Navigate Forword
        driver.navigate().forward();

    }
}
