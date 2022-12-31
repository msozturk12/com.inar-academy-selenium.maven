package Exercises_07_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class E06_Assertion {
    public static void main(String[] args) throws InterruptedException {

        //TestNg is one of the testing framework
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());//inside is false so it continue to execute
        //Assert.assertFalse(true);//stop
        System.out.println(" before click isSelected->" + driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();//regular expression
        System.out.println("after click isSelected->" +driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());//inside is true so it continue to execute


        int sizeOfCheckBoxes = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
        System.out.println("Size of checkboxes is--> " +sizeOfCheckBoxes);
        List<WebElement> list = driver.findElements(By.cssSelector("input[type='checkbox']"));
        for(WebElement we : list){
            System.out.println(we.getAccessibleName());
        }

        System.out.println("-------------------------------------------------------------------------------");


        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        System.out.println("before selection-> " +driver.findElement(By.id("divpaxinfo")).getText());
        /*


        for (int i = 0; i < 4; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();//4 times
        }
*/
        int counter=1;
        while(counter<5){

            driver.findElement(By.id("hrefIncAdt")).click();//4 times
            counter++;
        }

        driver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
        System.out.println("after selection-> " +driver.findElement(By.id("divpaxinfo")).getText());
    }
}
