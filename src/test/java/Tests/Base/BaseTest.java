package Tests;

import Framework.Base.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {


    @BeforeTest

    public static void setUp(String browserName) {
        DriverManager.createInstance(browserName);
        WebDriver driver = DriverManager.getWebDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public static void tearDown() {
        DriverManager.getWebDriver().close();
    }

}
