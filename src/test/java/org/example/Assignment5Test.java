package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Assignment5Test {
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/");
        driver.manage().window().maximize();
        int countOfLink = driver.findElements(By.tagName("a")).size();
        System.out.println(countOfLink);
        WebElement element = driver.findElement(By.xpath("//footer[@class='bg-background border-t border-border/20']"));
        int countOfLinksInFooter = element.findElements(By.tagName("a")).size();
        System.out.println(countOfLinksInFooter);
        Actions action = new Actions(driver);
        action.scrollToElement(element).build().perform();
        System.out.println(element.findElement(By.xpath("//h4[text()='Navigation']/following-sibling::div")).findElements(By.tagName("a")).size());
        List<WebElement> allLinksInNavigation = element.findElement(By.xpath("//h4[text()='Navigation']/following-sibling::div")).findElements(By.tagName("a"));
        for(WebElement link : allLinksInNavigation)
        {
            link.sendKeys(Keys.COMMAND, Keys.ENTER);
            Set<String> windows = driver.getWindowHandles();
            Iterator<String>it = windows.iterator();
            String parentWindow = it.next();
            String childWindow = it.next();
            driver.switchTo().window(childWindow);
            System.out.println(driver.getTitle());
            driver.close();
            driver.switchTo().window(parentWindow);
        }
        driver.quit();
    }
}
