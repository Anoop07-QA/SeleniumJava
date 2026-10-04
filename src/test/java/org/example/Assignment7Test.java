package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

public class Assignment7Test {
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        action.scrollToElement(driver.findElement(By.xpath("//legend[text()='Mouse Hover Example']"))).build().perform();
        List<WebElement> allPrices = driver.findElements(By.xpath("//table[@class='table-display']//tr/td[3]"));
        int sum = 0;
        for(WebElement price : allPrices)
        {
           sum = sum + Integer.parseInt(price.getText());
        }
        Assert.assertEquals(sum, 235);
        driver.quit();
    }
}
