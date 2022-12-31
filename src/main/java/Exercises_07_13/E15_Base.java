package Exercises_07_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class E15_Base {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));


        String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot","Carrot"};

        driver.get("https://rahulshettyacademy.com/seleniumPractise/");


        addItems(driver,itemsNeeded);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();

        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();

        //explicit wait
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
    }

    public static void addItems(WebDriver driver,String[] itemsNeeded){
        int counter =0;
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i <products.size() ; i++) {
            //Brocolli - 1kg
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();
            //format it to get actual vegetable name
            //check whether name you extracted is present in array
            //Convert array into array list for easy search

            List itemsNeededList= Arrays.asList(itemsNeeded);


            if(itemsNeededList.contains(formattedName)){
                counter++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                //3 times
                if(counter==itemsNeededList.size()){
                    break;
                }
            }

        }
    }
}
