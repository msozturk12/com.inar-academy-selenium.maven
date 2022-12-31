package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginPage {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webDriver.chrome.driver","C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        testLogin(driver,"standart_user","secret");
        testLogin(driver,"locked_out_user","secret");
        testLogin(driver,"raskol","wrongPass");
        testLogin(driver,"locked_out_user","secret_sauce");






    }
        public static void testLogin(WebDriver driver,String userName,String password) throws InterruptedException {

            driver.get("https://www.saucedemo.com/");
            driver.findElement(By.id("user-name")).sendKeys(userName);
            driver.findElement(By.name("password")).sendKeys(password);
            driver.findElement(By.id("login-button")).click();

        }
}
