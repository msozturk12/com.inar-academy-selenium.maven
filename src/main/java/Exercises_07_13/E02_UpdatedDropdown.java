package Exercises_07_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E02_UpdatedDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        System.out.println("before selection" +driver.findElement(By.id("divpaxinfo")).getText());
        int counter=1;
        while(counter<5){

            driver.findElement(By.id("hrefIncAdt")).click();//4 times
            counter++;
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println("after selection" +driver.findElement(By.id("divpaxinfo")).getText());


    }
}
