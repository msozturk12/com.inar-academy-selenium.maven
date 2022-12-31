package Exercises_07_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E03_DynamicDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        ////a[@value='MAA'] xpath for chennai

        // //div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']
        // //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']
        //
        ////a[@value='BLR']
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
    }
}
