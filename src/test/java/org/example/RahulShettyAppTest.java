package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class RahulShettyAppTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("inputUsername")).sendKeys("Anoop1521@gmail.com");
        driver.findElement(By.name("inputPassword")).sendKeys("Anoop@18");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        String errorMessage = driver.findElement(By.xpath("//p[@class='error']")).getText();
        Assert.assertEquals(errorMessage, "* Incorrect username or password");
        driver.quit();
    }
}
