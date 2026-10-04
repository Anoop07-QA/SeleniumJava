package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AssignmentTest {
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
        driver.findElement(By.name("name")).sendKeys("Anoop Ajikumar");
        driver.findElement(By.name("email")).sendKeys("anoop@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("Anoop@18");
        driver.findElement(By.id("exampleCheck1")).click();
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']")));
        dropdown.selectByVisibleText("Female");
        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.name("bday")).sendKeys("22/09/2026");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Assert.assertEquals("Success!", driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible strong")).getText());
        driver.quit();
    }
}
