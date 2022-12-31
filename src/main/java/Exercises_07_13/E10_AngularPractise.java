package Exercises_07_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E10_AngularPractise {
    public static void main(String[] args) {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.name("name")).sendKeys("Mesut Said ÖZTÜRK");
        driver.findElement(By.name("email")).sendKeys("msozturk12@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234");
        driver.findElement(By.id("exampleCheck1")).click();

        WebElement gnd = driver.findElement(By.id("exampleFormControlSelect1"));
        Select gender = new Select(gnd);
        gender.selectByVisibleText("Male");

        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[7]/input")).sendKeys("10/17/1996");

        driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/input")).click();
        System.out.println(driver.findElement(By.xpath("/html/body/app-root/form-comp/div/div[2]/div")).getText());




    }
}
