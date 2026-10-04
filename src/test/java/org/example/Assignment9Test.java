package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment9Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys("Ind");
        Thread.sleep(2000);
        List<WebElement>SuggestedList = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
        for(WebElement country : SuggestedList)
        {
            if(country.getText().equals("India"))
            {
                country.click();
                break;
            }
        }
        driver.quit();
    }
}
