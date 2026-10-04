package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6Test {
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("checkBoxOption2")).click();
        String selectedOption = driver.findElement(By.xpath("//label[@for='benz']")).getText().trim();
        Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
        dropdown.selectByVisibleText(selectedOption);
        driver.findElement(By.name("enter-name")).sendKeys(selectedOption);
        driver.findElement(By.id("alertbtn")).click();
        String alertText = driver.switchTo().alert().getText();
        Assert.assertTrue(alertText.contains(selectedOption));
        driver.quit();
    }
}
