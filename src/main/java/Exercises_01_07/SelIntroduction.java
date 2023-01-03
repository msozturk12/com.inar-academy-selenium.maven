package Exercises_1_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {
    public static void main(String[] args) {

    // Invoking Browser

        //for chrome Browser
        System.setProperty("webDriver.chrome.driver","C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://inar-academy.com/");
        driver.get("https://github.com/");
        System.out.println("driver window title "+driver.getTitle());
        System.out.println("Chrome url "+driver.getCurrentUrl());
        driver.quit();


        //for fireFox
        System.setProperty("webDriver.gecko.driver","C:\\Users\\mesut\\Desktop\\mozillaBrowser\\geckodriver");
        WebDriver driverFire = new FirefoxDriver();
        driverFire.get("https://www.youtube.com/");
        System.out.println("Firefox title " + driverFire.getTitle());
        System.out.println("Firefox url "+driverFire.getCurrentUrl());
        driver.quit();

        //for MicrosoftEdge
        System.setProperty("webDriver.edge.driver","C:\\Users\\mesut\\Desktop\\edgeDriver\\edgedriver");
        WebDriver driverEdge = new EdgeDriver();
        driverEdge.get("https://www.youtube.com/");
        System.out.println("Edge title " + driverEdge.getTitle());
        System.out.println("Edge url "+driverEdge.getCurrentUrl());
        driver.close();




    }

}
