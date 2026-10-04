package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment8Test {
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        int totalRowsPresent = driver.findElements(By.xpath("//table[@class='table-display']//tr")).size();
        System.out.println("Number of Rows = " + totalRowsPresent);
        int totalColumnPresent = driver.findElements(By.xpath("//table[@class='table-display']//tr/th")).size();
        System.out.println("Number of Columns = " + totalColumnPresent);
        List<WebElement> tableElements = driver.findElements(By.xpath("//table[@class='table-display']//tr[3]/td"));
        for(WebElement tableElement : tableElements)
        {
            System.out.println(tableElement.getText());
        }
        driver.quit();
    }
}
