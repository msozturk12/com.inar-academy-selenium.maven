package Exercises_07_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E12_HandlingAlert {
    public static void main(String[] args) throws InterruptedException {
        String name = "Mesut";
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("name")).sendKeys(name);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[id='alertbtn']")).click();

        //Take alert message
        System.out.println(driver.switchTo().alert().getText());
        //Alert acception
        driver.switchTo().alert().accept();

        //Confirm
        Thread.sleep(2000);
        driver.findElement(By.id("confirmbtn")).click();
        //in Confirm button it means 'cancel'
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();



    }
}
