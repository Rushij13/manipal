package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsercommands {
    public static void main( String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        //maximize
        driver.manage().window().maximize();
        //title
        String title = driver.getTitle();
        System.out.println(title);
        //CurrentURL
        String CurrenURL = driver.getCurrentUrl();
        System.out.println();
        //Pagesource
        String pagesource = driver.getPageSource();
        System.out.println(pagesource);
        //close
        driver.close();
    }
}
