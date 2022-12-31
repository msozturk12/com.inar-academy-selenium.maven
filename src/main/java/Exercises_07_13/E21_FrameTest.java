package Exercises_07_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class E21_FrameTest {
    public static void main(String[] args) {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

        //driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        //driver.findElement(By.id("draggable")).click();
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame(0);

        Actions a = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        a.dragAndDrop(source,target).build().perform();

        driver.switchTo().defaultContent();//exiting from frame
    }
}
