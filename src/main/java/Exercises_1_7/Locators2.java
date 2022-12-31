package Exercises_1_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.Arrays;

public class Locators2 {
    public static void main(String[] args) throws InterruptedException {

        String name = "Mesut";
        //System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        //WebDriver driver = new ChromeDriver();
        //System.setProperty("webDriver.gecko.driver","C:\\Users\\mesut\\Desktop\\mozillaBrowser\\geckodriver");
        //WebDriver driver = new FirefoxDriver();
        System.setProperty("webDriver.edge.driver","C:\\Users\\mesut\\Desktop\\edgeDriver\\edgedriver");
        WebDriver driver = new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String password = getPassword(driver);

        driver.get("https://rahulshettyacademy.com/locatorspractice/");//open Website
        driver.findElement(By.id("inputUsername")).sendKeys(name);//go to input username window and sendkey name
        driver.findElement(By.name("inputPassword")).sendKeys(password); //go to input password window and sendkey password
        driver.findElement(By.className("signInBtn")).click(); //click to sign in button
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        String actual = driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
        Assert.assertEquals(actual,"Hello " + name + ",");
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();
        Thread.sleep(2000);
        driver.close();


    }

    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        //Please use temporary password 'rahulshettyacademy' to Login.
        String passwordText =driver.findElement(By.cssSelector("form p")).getText();
        String[] passwordArray = passwordText.split("'");
        //System.out.println("PASSWORD ARRAY"+ Arrays.toString(passwordArray));
        //0th index-->Please use temporary password
        //1th index-->rahulshettyacademy
        //2th index-->to Login.
        return passwordArray[1];



    }
}
