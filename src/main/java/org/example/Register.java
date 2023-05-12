package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Register {
    public static void main( String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rushi\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();

        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstName']"));

        Actions alt  = new Actions(driver);

        Action seriesofactions = alt.moveToElement(firstname).click().keyDown(firstname , Keys.SHIFT).sendKeys(firstname, "Rushikesh").build();

        seriesofactions.perform();

        WebElement lastname = driver.findElement(By.xpath("//input[@name ='lastName']"));

        alt = new Actions(driver);

        seriesofactions = alt.moveToElement(lastname).click().keyDown(lastname, Keys.SHIFT).sendKeys(lastname, "Joshi").build();


        seriesofactions.perform();

        WebElement Phone = driver.findElement(By.xpath("//input[@name ='phone']"));

        alt = new Actions(driver);

        seriesofactions = alt.moveToElement(Phone).click().keyDown(Phone, Keys.NUMPAD9).sendKeys(Phone, "9834573577").build();


        seriesofactions.perform();

        WebElement Email = driver.findElement(By.xpath("//input[@name ='userName']"));

        alt = new Actions(driver);

        seriesofactions = alt.moveToElement(Email).click().keyDown(Email, Keys.SHIFT).sendKeys(Email, "rushirj8@outlook.com").build();


        seriesofactions.perform();

        WebElement Address = driver.findElement(By.xpath("//input[@name ='address1']"));

        alt = new Actions(driver);

        seriesofactions = alt.moveToElement(Address).click().keyDown(Address, Keys.SHIFT).sendKeys(Address, "Ashirwad Nagar,Parbhani").build();


        seriesofactions.perform();


    }
}
