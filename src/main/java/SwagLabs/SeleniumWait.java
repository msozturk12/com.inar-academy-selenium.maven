package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumWait {
    public static void main(String[] args) {
        System.setProperty("webDriver.chrome.driver","C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standart_user");
        driver.findElement(By.name("password")).sendKeys("secret");
        driver.findElement(By.id("login-button")).click();

       // WebDriverWait waitObj = new WebDriverWait(driver,8);
        //waitObj.until(ExpectedConditions.elementToBeClickable(By.id()));
    }
}
