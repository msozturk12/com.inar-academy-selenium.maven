package Exercises_1_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/");
        String str = driver.getCurrentUrl();

        //String pageSource = driver.getPageSource();

        String titleOfPage= driver.getTitle();

        System.out.println("Test1 : ".concat(str));
        Thread.sleep(5000);//waits 2 second

        //System.out.println("pagesource-->" + pageSource);

        System.out.println("title of page-->" + titleOfPage);


        driver.close();
    }

}
