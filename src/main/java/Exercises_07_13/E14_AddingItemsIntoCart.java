package Exercises_07_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class E14_AddingItemsIntoCart {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        int counter =0;

        String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot","Carrot"};

        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        Thread.sleep(3000);

        ////button[text()='ADD TO CART']
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
