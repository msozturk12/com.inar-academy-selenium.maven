package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Ex01LoginPage1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        //testCase1 wrong userName and Password
        testCase(driver,"Brad","1234");

        //testCase2 correct userName and wrong password
        testCase(driver,"Tester","supernova32");

        //testCase3 wrong userName and correct password
        testCase(driver,"Tester123","Exercises_1_7.test");

        //testCase3 correct userName and password
        testCase(driver,"Tester","Exercises_1_7.test");
        driver.quit();

    }

    public static void testCase(WebDriver driver,String userName,String password) throws InterruptedException {
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(userName);
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id='ctl00_MainContent_login_button']")).click();

    }
}
