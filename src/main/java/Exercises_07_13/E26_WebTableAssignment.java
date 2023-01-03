package Exercises_07_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E26_WebTableAssignment {
    public static void main(String[] args) {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        /*
        1-Number of col
        2-Number of row
        3-print second row content
         */
        // 1-Number of col
        WebElement table = driver.findElement(By.id("product"));
        System.out.println("Number of col ->" +table.findElements(By.tagName("tr")).size());

        //2-Number of row
        System.out.println("Number of row ->" + table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

        //  3-print second row content
        List<WebElement> secondRow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
        System.out.println(secondRow.get(0).getText());
        System.out.println(secondRow.get(1).getText());
        System.out.println(secondRow.get(2).getText());



    }
}
