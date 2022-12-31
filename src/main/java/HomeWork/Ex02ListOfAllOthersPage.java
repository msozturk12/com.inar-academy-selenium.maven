package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Ex02ListOfAllOthersPage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

        //LoginPage(check one order)
        goToListOfAllOthers(driver);
        driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl02_OrderSelector")).click();
        Thread.sleep(2000);


        //TestCase2(check multiple order)
        goToListOfAllOthers(driver);
        driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl05_OrderSelector")).click();
        driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl09_OrderSelector")).click();
        driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl08_OrderSelector")).click();
        Thread.sleep(2000);


        //TestCase3(check all order)
        goToListOfAllOthers(driver);
        driver.findElement(By.xpath("//*[@id='ctl00_MainContent_btnCheckAll']")).click();
        Thread.sleep(2000);


        //TestCase4(check all order and uncheck all)
        goToListOfAllOthers(driver);
        driver.findElement(By.xpath("//*[@id='ctl00_MainContent_btnCheckAll']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_MainContent_btnUncheckAll")).click();
        Thread.sleep(2000);


        //TestCase5(check one and delete selected)
        goToListOfAllOthers(driver);
        driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl05_OrderSelector")).click();
        driver.findElement(By.cssSelector("input.btnDeleteSelected")).click();
        Thread.sleep(2000);
        driver.close();


    }

    public static void goToListOfAllOthers(WebDriver driver) {
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.xpath("//*[@id='ctl00_MainContent_password']")).sendKeys("Exercises_1_7.test");
        driver.findElement(By.cssSelector("input.button")).click();

    }
}
