package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Ex03OrderPage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\mesut\\Desktop\\chromeBrowser\\chromedriver");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);

        //LoginPage fill the product Information------------------------------------------------------------------------------------------
        /*
        product-->myMoney
        Quantity-->50
        press calculate button
         */
        goToOrderPage(driver);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")).click();
        actions.doubleClick(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]"))).perform();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]")).sendKeys("50");
        driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder']/tbody/tr/td/ol[1]/li[5]/input[2]")).click();
        Thread.sleep(2000);

        //TestCase2 fill the product Information------------------------------------------------------------------------------------------
        /*
        product-->FamilyAlbum
        Quantity-->80
         */
        goToOrderPage(driver);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_ddlProduct\"]/option[2]")).click();
        actions.doubleClick(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]"))).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]")).sendKeys("30");
        driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder']/tbody/tr/td/ol[1]/li[5]/input[2]")).click();
        Thread.sleep(2000);


        //TestCase3 fill the product Information---------------------------------------------------------------------------------------
        /*
        product-->ScreenSaver
        Quantity-->150
         */
        goToOrderPage(driver);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_ddlProduct\"]/option[3]")).click();
        actions.doubleClick(driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"))).perform();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("150");
        driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder']/tbody/tr/td/ol[1]/li[5]/input[2]")).click();
        Thread.sleep(2000);


        //TestCase4 fill just two part of the Address Information and reset it--------------------------------------------------------
        goToOrderPage(driver);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")).click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("Mesut");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]")).sendKeys("liberte");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder\"]/tbody/tr/td/div/input")).click();
        Thread.sleep(1000);


        //TestCase5 fill all the Address Information-----------------------------------------------------------------------------------
        goToOrderPage(driver);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")).click();
        WebElement customerName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        customerName.sendKeys("Mesut");

        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]")).sendKeys("liberte");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox3\"]")).sendKeys("Amsterdam");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("District9");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("4214");
        Thread.sleep(2000);

        //TestCase6 fill  all tabs except Customer name and process it----------------------------------------------------------
        goToOrderPage(driver);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")).click();
        actions.doubleClick(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]"))).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]")).sendKeys("70");
        driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder']/tbody/tr/td/ol[1]/li[5]/input[2]")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")).click();
        // driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("Rahul");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]")).sendKeys("liberte");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox3\"]")).sendKeys("Anvers");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("District7");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("2112");
        Thread.sleep(2000);

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")).click();
        driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_cardList_0']")).click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("42507790872758");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox1\"]")).sendKeys("11/30");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
        Thread.sleep(2000);


        //TestCase7 fill the all tabs and process them-------------------------------------------------------------------------------
        goToOrderPage(driver);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")).click();
        actions.doubleClick(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]"))).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]")).sendKeys("70");
        driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder']/tbody/tr/td/ol[1]/li[5]/input[2]")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")).click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("Rahul");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]")).sendKeys("liberte");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox3\"]")).sendKeys("Anvers");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("District7");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("2112");
        Thread.sleep(2000);

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")).click();
        driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_cardList_0']")).click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("42507790872758");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox1\"]")).sendKeys("11/30");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
        Thread.sleep(2000);


    }

    public static void goToOrderPage(WebDriver driver) throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.xpath("//*[@id='ctl00_MainContent_password']")).sendKeys("Exercises_1_7.test");
        driver.findElement(By.cssSelector("input.button")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Order")).click();

    }
}
