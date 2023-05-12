package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Registration {
    public static void main( String[] args) throws InterruptedException{
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rushi\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();


        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
        firstName.sendKeys("Rushikesh");
        Thread.sleep(600);

        WebElement lastName = driver.findElement(By.xpath("//input[@name ='lastName']"));
        lastName.sendKeys("Joshi");
        Thread.sleep(600);

        WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys("9834573577");
        Thread.sleep(600);

        WebElement email = driver.findElement(By.xpath("//input[@name='userName']"));
        email.sendKeys("rushijoshi@gmail.com");
        Thread.sleep(600);

        WebElement address = driver.findElement(By.xpath("//input[@name='address1']"));
        address.sendKeys("Ashirwad Nagar ");
        Thread.sleep(600);

        WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
        city.sendKeys("Parbhani");
        Thread.sleep(600);

        WebElement state = driver.findElement(By.xpath("//input[@name='state']"));
        state.sendKeys("Maharashtra");
        Thread.sleep(600);

        WebElement Postalcode = driver.findElement(By.xpath("//input[@name='postalCode']"));
        Postalcode.sendKeys("431401");
        Thread.sleep(600);

        WebElement Username = driver.findElement(By.xpath("//input[@name ='email']"));
        Username.sendKeys("rushijoshi@gmail.com");
        Thread.sleep(600);

        WebElement Password = driver.findElement(By.xpath("//input[@name ='password']"));
        Password.sendKeys("joshirushi123");
        Thread.sleep(600);

        WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@name ='confirmPassword']"));
        ConfirmPassword.sendKeys("joshirushi123");
        Thread.sleep(600);

    }
}