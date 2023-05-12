package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class Edgelauncher {
    @Test
    public void edge() {
        System.setProperty("webdriver.msedgedriver.driver", "C:\\Users\\Rushi\\Downloads\\edgedriver_win32\\msedgedriver.exe");
        WebDriver driver;
        driver = new EdgeDriver();
        driver.get("https://www.facebook.com/login/");
    }
}
