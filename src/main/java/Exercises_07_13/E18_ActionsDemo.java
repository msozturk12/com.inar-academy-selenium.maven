package Exercises_07_13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class E18_ActionsDemo {
    public static void main(String[] args) {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        Actions a = new Actions(driver);

        WebElement move = driver.findElement(By.cssSelector("#nav-link-accountList"));
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click()
                .keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

        //moves to specific element
        a.moveToElement(move).contextClick().build().perform();


    }
}
