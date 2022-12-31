package Exercises_07_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class E16_Assignment {
    public static void main(String[] args) {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.name("password")).sendKeys("learning");
        driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();

        WebElement options =driver.findElement(By.xpath("//select[@class='form-control']"));
        Select dropDown = new Select(options);
        dropDown.selectByValue("consult");
        driver.findElement(By.id("signInBtn")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.nav-link.btn.btn-primary")));
        List<WebElement> products = driver.findElements(By.xpath("//button[@class='btn btn-info']"));

        for (int i = 0; i < products.size() ; i++) {
            products.get(i).click();

        }
        driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
    }
}
