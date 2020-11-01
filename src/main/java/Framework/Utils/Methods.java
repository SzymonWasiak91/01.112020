package Framework.Utils;

import Framework.Base.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.NoSuchElementException;

public class Methods {

    private WebDriver driver = DriverManager.getWebDriver();

    public Methods(WebDriver driver){
        this.driver = driver;
    }

    public  void waintUntilElementVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.withTimeout(Duration.ofSeconds(1));
        wait.pollingEvery(Duration.ofSeconds(1));

    }

    public void waintUntilElemenClicable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        wait.withTimeout(Duration.ofSeconds(1));
        wait.pollingEvery(Duration.ofSeconds(1));

    }

    public void waintUntilListVisible(List<WebElement> elementList) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(driver -> elementList.size() > 0);

    }

    public static String takeScreeanShot(WebDriver driver) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File screneShotFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("src/main/resources/screanShot" + LocalTime.now().getNano() + ".png");
        Files.copy(screneShotFile.toPath(), destinationFile.toPath());
        return destinationFile.getAbsolutePath();
    }
    public void scrolPadown1100(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1100)");
    }
    public void moetToWebelement(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.build().perform();
    }


}
