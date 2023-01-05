package Test;

import org.testng.annotations.*;

public class day3 {
    @BeforeClass
    public void beforeClass() {
        System.out.println("before executing any methods in the class");
    }

    @Parameters({"URL", "APIKey/username"})
    @Test
    public void WebLoginCarLoan(String urlName, String key) {
        //Selenium
        System.out.println("WebLoginCar");
        System.out.println(urlName);
        System.out.println(key);
    }

    @BeforeMethod
    public void bfEvery() {
        System.out.println("I will execute before every test method in day 3 class");
    }

    @AfterMethod
    public void afEvery() {
        System.out.println("I will execute after every test method in day 3 class");
        System.out.println("-----------------------------------------------------------------");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("after executing all methods in the class");
    }

    @Test(groups = {"Smoke"})
    public void MobileLoginCarLoan() {
        //Appium
        System.out.println("MobileLoginCar");
    }

    @Test(enabled = false)
    public void MobileSignInCarLoan() {
        //Appium
        System.out.println("Mobile SIGN IN");
    }

    @BeforeSuite
    public void BeforeEvery() {
        System.out.println("I am number 1");
    }

    @Test(dataProvider = "getData")
    public void MobileSignOutCarLoan(String userName,String password) {
        //Appium
        System.out.println("Mobile SIGN OUT");
        System.out.println(userName);
        System.out.println(password);
    }

    @Test(dependsOnMethods = {"WebLoginCarLoan", "MobileSignOutCarLoan"})
    public void APICarLoan() {
        //Rest API automation
        System.out.println("APILoginCar");
    }

    @DataProvider
    public Object[][] getData() {
        //1st combination - username password - good credit history
        //2nd username password - no credit history
        //3rd fraudelent credit history

        Object[][] data = new Object[3][2];
        //1st set
        data[0][0] = "firstSetUserName";
        data[0][1] = "firstPassword";

        //2nd set
        data[1][0] = "secondSetUserName";
        data[1][1] = "secondPassword";

        //3rd set
        data[2][0] = "thirdSetUserName";
        data[2][1] = "thirdPassword";

        return data;


    }

}



