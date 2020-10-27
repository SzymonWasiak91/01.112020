import Framework.Base.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GGG {
    @Test
    public void testDriver(){
        DriverManager.createInstance();
        DriverManager.getWebDriver().get("https://www.google.pl");



    }
}
