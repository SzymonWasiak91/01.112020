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
                String chromePath = "C:\\Users\\wasia\\IdeaProjects\\Project1\\src\\main\\resources\\Drivers\\chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", chromePath );
                driver = new ChromeDriver();
            }
        }if(browserName.equalsIgnoreCase("Opera")){
            if (System.getProperty("webdriver.opera.driver") == null) {
                String operaPath = "C:\\Users\\wasia\\IdeaProjects\\Project1\\src\\main\\resources\\Drivers\\operadriver.exe";
                System.setProperty("webdriver.opera.driver", operaPath);
                driver = new OperaDriver();
            }
        }if(browserName.equalsIgnoreCase("Firefox")){
            if (System.getProperty("webdriver.gecko.driver") == null) {
                String firefoxPath = "C:\\Users\\wasia\\IdeaProjects\\Project1\\src\\main\\resources\\Drivers\\geckodriver.exe";
                System.setProperty("webdriver.gecko.driver", firefoxPath);
                driver = new FirefoxDriver();
            }
        }
        return driver;
    }
}
