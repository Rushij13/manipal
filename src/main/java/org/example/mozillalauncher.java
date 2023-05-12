package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class mozillalauncher {
    @Test
    public void mozilla() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rushi\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/login/");
    }
}
