package Framework.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

/*ThreadLocal wykorzystywane do współbieżnego uruchamiania testów
dlatego też getter i seter posiada meteodę get i set wewnątrz metody

 */
       private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();


    public static WebDriver getWebDriver() {
        return  webDriver.get();
    }
    public static void setWebDriver(WebDriver driver){
        webDriver.set(driver);

    }
    /*
    Weryfikacja czy zmienne są puste jeśli są, następuje ustawienie oraz przesłania
    ścieżki absolutnej do driera oraz ustawienie pożądanegio drivera przeglądarki
     */
    public static void createInstance() {
// Zostały przeniesione do klasy DriverFactory
//        if (System.getProperty("webdriver.chrome.driver") == null) {
//            System.setProperty("webdriver.chrome.driver", "C:\\Users\\wasia\\IdeaProjects\\Project1\\src\\main\\resources\\Drivers\\chromedriver.exe");
//            setWebDriver(new ChromeDriver());
//        }
        setWebDriver(DriverFactory.createWebDriverInstance("Chrome"));



    }
}
