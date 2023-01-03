package Exercises_07_13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class E25_Scrolling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        Thread.sleep(3000);
        js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");

        List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum =0;
        for (WebElement we : values) {
            sum = sum + Integer.parseInt(we.getText());
        }
        System.out.println("Sum of values--> " + sum);

        String number = driver.findElement(By.cssSelector(".totalAmount")).getText();
        String[] num = number.split(":");
        int total = Integer.parseInt(num[1].trim());

        Assert.assertEquals(sum,total);
        System.out.println("They are equal");


    }
}
