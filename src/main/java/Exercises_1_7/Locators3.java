package Exercises_1_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {
    public static void main(String[] args) {
        System.setProperty("webDriver.chrome.driver","C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        //Sibling-Child to parent traverse
        ////header/div/button[1]/following-sibling::button[1]
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        String text = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
        System.out.println(text);

        String login = driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText();
        System.out.println(login);





    }
}
