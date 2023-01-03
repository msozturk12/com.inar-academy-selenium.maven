package Exercises_07_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class E30_BrokenLink {
    public static void main(String[] args) throws IOException {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();


        //Broken link
        //Step1 - to get all urls tied up to the links using Selenium
        //java methods will call URL's and gets you the status code
        //if status code > 400 then that url is not working -->link which tied to url is broken

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
        SoftAssert a = new SoftAssert();

        for(WebElement weLink : links){

            String url = weLink.getAttribute("href");
            HttpURLConnection conn = ( HttpURLConnection)new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int respCode = conn.getResponseCode();
            System.out.println(respCode);

            //Soft Assertion
           a.assertTrue(respCode<400,"The link with test " + weLink.getText() + " is broken with code " + respCode);


        }
        a.assertAll();
    }
}
