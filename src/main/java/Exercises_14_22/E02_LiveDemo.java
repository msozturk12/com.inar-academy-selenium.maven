package Exercises_14_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class E02_LiveDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        //1-click on column
        Thread.sleep(1000);
        driver.findElement(By.xpath("//tr/th[1]")).click();

        //2-capture all webElement into list
        List<WebElement> list =driver.findElements(By.xpath("//tr/td[1]"));

        //3-Capture text of all webelement into new list

        List<String> originalList = list.stream().map(s -> s.getText()).collect(Collectors.toList());

        //4-sort on the original list of step 3 --> sorted list
        List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

        //5-compare original vs sorted list
        Assert.assertEquals(originalList,sortedList);
        System.out.println("Test has passed");

        //scan the name column and with getText->Beans -> print the price of Beans
         List<String> prices = list.stream().filter(s -> s.getText().contains("Beans")).map(s -> getPriceVegetable(s)).collect(Collectors.toList());
         prices.forEach(a -> System.out.println(a));



    }

    public static String getPriceVegetable(WebElement s) {
       return s.findElement(By.xpath("following-sibling::td[1]")).getText();

    }
}
