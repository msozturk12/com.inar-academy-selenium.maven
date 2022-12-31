package Exercises_07_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E04_AutoSuggestive {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(2000);

        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));//it has 3 element

        for (WebElement option : options) {
            if(option.getText().equalsIgnoreCase("india")){
                option.click();
                break;
            }
        }


    }
}
