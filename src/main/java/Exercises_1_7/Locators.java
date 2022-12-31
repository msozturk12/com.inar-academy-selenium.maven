package Exercises_1_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        //open Website
        //go to input username window and sendkey rahul
        //go to input password window and sendkey hello123
        //click to sign in button
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("signInBtn")).click();
        //Thread.sleep(5000);
        String getText = driver.findElement(By.cssSelector("p.error")).getText();
        System.out.println("getText-->" + getText);

        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Mesut");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("msozturk12@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        Thread.sleep(2000);
        //driver.findElement(By.cssSelector("input[@placeholder='Email']")).sendKeys("secondEmail@ca");
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("secondEmail@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("09365847589");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());

        driver.findElement(By.xpath("//div[@class = 'forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();


    }
}
