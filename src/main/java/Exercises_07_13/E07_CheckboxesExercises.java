package Exercises_07_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E07_CheckboxesExercises {
    public static void main(String[] args) {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("checkBoxOption1")).click();
        driver.findElement(By.id("checkBoxOption1")).isSelected();//should Print true
        driver.findElement(By.id("checkBoxOption1")).click();
        driver.findElement(By.id("checkBoxOption1")).isSelected();//Should print false


        //driver.findElement(By.xpath("//input[@type='checkbox']")).getSize();
        System.out.println(driver.findElements(By.cssSelector("input[value='checkbox']")).size());
        //driver.findElements(By.cssSelector("input[value='checkbox']")).size();
        System.out.println("Size of checkboxes --> " +driver.findElement(By.xpath("//input[@type='checkbox']")).getSize());



    }
}
