package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class singlecheckbox {
    public static void main( String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/checkboxradio/");
        driver.manage().window().maximize();

        WebElement frame = driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"));

        driver.switchTo().frame(frame);

        WebElement chechbox = driver.findElement(By.xpath(("(//span[@class = 'ui-checkboxradio-icon-space'])[4]")));
        if (chechbox.isDisplayed()){
            chechbox.click();
        }
        driver.close();
    }
}
