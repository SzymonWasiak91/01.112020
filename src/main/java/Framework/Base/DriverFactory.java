package Framework.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverFactory {
    /*Metoda wywołująca wybranego drivera pożdanej przeglądarki,
    przekazywany jest String + nazwa przeglądarki, metoda IgnorCase sprawdza String
    bez wielkości znaków

     */

    public static WebDriver createWebDriverInstance(String browserName){
        WebDriver driver = null;

        if(browserName.equalsIgnoreCase("Chrome")){
            if (System.getProperty("webdriver.chrome.driver") == null) {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\wasia\\IdeaProjects\\Project1\\src\\main\\resources\\Drivers\\chromedriver.exe");
                driver = new ChromeDriver();
            }
        }if(browserName.equalsIgnoreCase("Opera")){
            if (System.getProperty("webdriver.opera.driver") == null) {
                System.setProperty("webdriver.opera.driver", "C:\\Users\\wasia\\IdeaProjects\\Project1\\src\\main\\resources\\Drivers\\operadriver.exe");
                driver = new OperaDriver();
            }
        }if(browserName.equalsIgnoreCase("Firefox")){
            if (System.getProperty("webdriver.gecko.driver") == null) {
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\wasia\\IdeaProjects\\Project1\\src\\main\\resources\\Drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
            }
        }
        return driver;
    }
}
