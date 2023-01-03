package Exercises_14_22;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class E05_NewWindow {
    public static void main(String[] args) throws IOException {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        //switchingWindow
        driver.switchTo().newWindow(WindowType.TAB);
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String parentWindowId = it.next();
        String childWindow = it.next();
        driver.switchTo().window(childWindow);

        driver.get("https://rahulshettyacademy.com/");
        String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
                .get(3).getText();

        driver.switchTo().window(parentWindowId);
        WebElement name = driver.findElement(By.cssSelector("[name = 'name']"));
        name.sendKeys(courseName);

        //ScreenShot
        File file = name.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("C:\\Users\\mesut\\Desktop\\SDET\\nameBox.png"));


        //Get Height & Width
        System.out.println("height-> " + name.getRect().getDimension().getHeight());
        System.out.println("width -> " + name.getRect().getDimension().getWidth());



    }
}
