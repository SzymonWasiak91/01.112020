import Framework.Base.DriverManager;
import Framework.Utils.Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class GGG {
    @Test
    public void testDriver(){
        DriverManager.createInstance("chrome");
        DriverManager.getWebDriver().get("https://www.google.pl");


    }
}
