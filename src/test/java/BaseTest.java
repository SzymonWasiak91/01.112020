import Framework.Base.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {



public BaseTest(){
}
    @BeforeTest

    public  void setUp(String browserName){

        DriverManager.createInstance(browserName);
        WebDriver driver = DriverManager.getWebDriver();
        driver.manage().window().maximize();
    }
    @AfterTest
    public void tearDown(){
        DriverManager.getWebDriver().quit();
    }

}
