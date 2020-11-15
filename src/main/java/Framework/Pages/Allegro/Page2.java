package Framework.Pages.Allegro;

import Framework.Base.DriverManager;
import Framework.Utils.Methods;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Page2 {

    @FindBy(xpath = "//span[text()='dodaj do koszyka']")
    private List<WebElement> listaProduktow;
    private WebDriver driver = DriverManager.getWebDriver();
    private Methods methods = new Methods(driver);


    public Page2() {
        PageFactory.initElements(driver, this);
        this.methods = methods;
    }
    By zakresOd = By.xpath("//*[@name='od']");
    By zakresDo = By.xpath("//*[@name='do']");
    By zmianaSortowania = By.xpath("/html/body/div[2]/div[4]/div/div/div/div/div/div[2]/div[1]/div[2]/div[4]/i");
    By pierwszyrpoduktZListy = By.xpath("//section/*[1]/*[1]");

    public void zakresCen(String OD, String DO) throws InterruptedException {
        methods.waintUntilElemenClicableLocator(zakresOd);
        driver.findElement(zakresOd).click();
        driver.findElement(zakresOd).clear();
        driver.findElement(zakresOd).sendKeys(OD);
        methods.waintUntilElemenClicableLocator(zakresDo);
        driver.findElement(zakresDo).click();
        driver.findElement(zakresDo).clear();
        driver.findElement(zakresDo).sendKeys(DO);

    }
    public void zaznaczZamianeWidoku(){
        WebElement zmianasortowaniaElement = driver.findElement(zmianaSortowania);
        Actions actions = new Actions(driver);
        actions.moveToElement(zmianasortowaniaElement).click().build().perform();

    }
    public void sprawdzHoveryPrzedmiotow() throws InterruptedException {
        Thread.sleep(5000);
        methods.waintUntilListVisible(listaProduktow);
        Actions actions = new Actions(driver);
        for(WebElement produkt: listaProduktow){
            actions.moveToElement(produkt);
        }

    }
    public void dodajPierwszyPrzedmiot(){
        methods.waintUntilElemenClicableLocator(pierwszyrpoduktZListy);
        driver.findElement(pierwszyrpoduktZListy).click();

    }



}
