package Exercises_1_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {
    public static void main(String[] args) {


        System.setProperty("webDriver.chrome.driver","C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        driver.navigate().to("http://rahulshettyacademy.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("http://youtube.com");
        driver.navigate().refresh();
        driver.close();


    }
}
