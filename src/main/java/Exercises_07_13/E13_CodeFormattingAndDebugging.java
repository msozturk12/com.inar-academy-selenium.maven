package Exercises_07_13;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.Files;

import java.io.File;

public class E13_CodeFormattingAndDebugging {
    public static void main(String[] args) {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://tr-tr.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("qwed");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://google.com");
        int a =5;
        getScreenShot(driver);

    }

    private static void getScreenShot(WebDriver driver) {
        driver.get("http://google.com");
        File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files FileUtils = null;
       // FileUtils.copyFile(src,new File("C:\\Users\\rahul\\screenshot.png"));
    }
}
