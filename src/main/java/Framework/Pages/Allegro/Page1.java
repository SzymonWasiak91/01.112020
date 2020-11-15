package Framework.Pages.Allegro;

import Framework.Base.DriverManager;
import Framework.Utils.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {

    private WebDriver driver = DriverManager.getWebDriver();
    private Methods methods = new Methods(driver);


    public Page1() {
        PageFactory.initElements(driver, this);
        this.methods = methods;
    }


    By buttonPrzejdzDalejLokator = By.xpath("//button[text()='przejdź dalej']");
    By searchInputLocator = By.xpath("//input[@type='search']");
    By listbox = By.xpath("//div[@role='listbox']");



    public void getURL(String urlAdres) {
        driver.get(urlAdres);

    }
    public void klikButtonPrzejdzDalej(){
        methods.waintUntilElemenClicableLocator(buttonPrzejdzDalejLokator);
        driver.findElement(buttonPrzejdzDalejLokator).click();
    }
    public void wyszukaj(String przedmiot){
        methods.waintUntilElemenClicableLocator(searchInputLocator);
        driver.findElement(searchInputLocator).clear();
        driver.findElement(searchInputLocator).click();
        driver.findElement(searchInputLocator).sendKeys(przedmiot);
        methods.waintUntilElementVisibleLocator(listbox);
        driver.findElement(searchInputLocator).sendKeys(Keys.ENTER);


    }



}
