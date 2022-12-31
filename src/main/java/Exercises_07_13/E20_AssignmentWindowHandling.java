package Exercises_07_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class E20_AssignmentWindowHandling {

    public static void main(String[] args) {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        //click on multiple windows
        driver.findElement(By.linkText("Multiple Windows")).click();
        // and then click here
        driver.findElement(By.cssSelector("a[href*='windows']")).click();


        //capture new window and write it on your output
        Set<String>options = driver.getWindowHandles();
        Iterator<String> it = options.iterator();
        String parentWindow = it.next();

        driver.switchTo().window(it.next());

        System.out.println(driver.findElement(By.xpath("/html/body/div/h3")).getText());
        driver.switchTo().window(parentWindow);

        System.out.println(driver.findElement(By.xpath("//*[@id='content']/div/h3")).getText());

        //switch back to first window and print opening a window
        //first line printed 'new window' and thereafter ' 'opening a window'
    }
}
