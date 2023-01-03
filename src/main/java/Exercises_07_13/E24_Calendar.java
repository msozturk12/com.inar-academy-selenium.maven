package Exercises_07_13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class E24_Calendar {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Navigate to page
        driver.get("https://www.path2usa.com/travel-companion/");
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(1000);


        WebElement calendarBox = driver.findElement(By.id("form-field-travel_comp_date") );
        calendarBox.click();
        Thread.sleep(1000);
        calendarBox.click();

        //we are going to april tab
        driver.findElement(By.cssSelector("span.flatpickr-next-month")).click();
        Thread.sleep(2000);



        List<WebElement> dates = driver.findElements(By.xpath("//span[@class='flatpickr-day ']"));
        System.out.println(dates.size());

        //Grab common attribute // put into list and iterate
        for (WebElement element:dates) {
            String str = element.getText();
            str.trim();
            if(str.equalsIgnoreCase("21")){
                element.click();
            }

        }



    }
}
