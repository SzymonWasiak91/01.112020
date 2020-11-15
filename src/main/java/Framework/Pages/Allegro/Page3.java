package Framework.Pages.Allegro;

import Framework.Base.DriverManager;
import Framework.Utils.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3 {



    WebDriver driver = DriverManager.getWebDriver();
    Methods methods;

    public Page3() {
        PageFactory.initElements(driver, this);
        this.methods = new Methods(driver);
    }
    By buttonDodajDoKoszyka = By.id("add-to-cart-button");
    By buutonIdzDoKoszyka = By.xpath("/html/body/div[2]/div[7]/div/div[2]/div/div/div/div/div[3]/a");




    public void dodajDoKoszyka(){
        methods.waintUntilElemenClicableLocator(buttonDodajDoKoszyka);
        driver.findElement(buttonDodajDoKoszyka).click();
    }
    public void idzDoKoszyka(){
        methods.waintUntilElementVisibleLocator(buutonIdzDoKoszyka);
        driver.findElement(buutonIdzDoKoszyka).click();
    }


}
