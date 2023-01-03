package Exercises_07_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E24_Assignment {
    /*
    1-select any checkbox
    2-grab the label of the selected checkbox// put into variable
    3-Select an option in dropbox.<option come from step 2>//make it dynamic
    4-Enter the step 2 grabbed label twxt in Editbox//
    5-Click alert and then verify if text grabbed from step2 is present in the pop up message

     */
    public static void main(String[] args) {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.id("checkBoxOption2")).click();
        String opt = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

        WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
        Select s = new Select(dropDown);
        s.selectByVisibleText(opt);

        driver.findElement(By.name("enter-name")).sendKeys(opt);
        driver.findElement(By.id("alertbtn")).click();

        String text =driver.switchTo().alert().getText();
        if(text.contains(opt)){
            System.out.println("Alert message success ");

        }else{
            System.out.println("Something wrong with execution");
        }

    }
}














