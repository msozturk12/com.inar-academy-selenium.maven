package Exercises_07_13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class E23_Scope {
    public static void main(String[] args) throws InterruptedException {

        //1. Give me the count of links on the page.
        //2.Count of footer section-
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());

        //we small the scope
        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));//limiting webdriver scope
        System.out.println(footerDriver.findElements(By.tagName("a")).size());

        //3-This is the left-bottom side link number
        WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columnDriver.findElements(By.tagName("a")).size());

        //4-click on each 4 links in the column and check if the pages are opening-
        int size = columnDriver.findElements(By.tagName("a")).size();

        //opens all tabs
        for (int i = 1; i < size; i++) {

            String clickOnLinkNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkNewTab);
            //columnDriver.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL, Keys.ENTER);
            Thread.sleep(5000L);
        }

        Set<String> title = driver.getWindowHandles(); //4
        Iterator<String> it = title.iterator();

        while (it.hasNext()) {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }


    }


}
