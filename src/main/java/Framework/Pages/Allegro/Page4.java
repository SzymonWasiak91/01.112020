package Framework.Pages.Allegro;

import Framework.Base.DriverManager;
import Framework.Utils.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page4 {



    WebDriver driver = DriverManager.getWebDriver();
    Methods methods = new Methods(driver);


    public Page4() {
        PageFactory.initElements(driver, this);
        this.methods = methods;

    }
   private By usunPrzedmioButton = By.xpath("//i[@title='usuń przedmiot']");
   private By komunikatoUsunieciu = By.xpath("//*[@id=\"emptyCartContent\"]/div[2]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/h2/span");

    public void usunPrzedmiot(){
        methods.waintUntilElementVisibleLocator(usunPrzedmioButton);
        driver.findElement(usunPrzedmioButton).click();
    }
    public String pobierzTextKoncowy(){
        methods.waintUntilElementVisibleLocator(komunikatoUsunieciu);
       String komunikat =  driver.findElement(komunikatoUsunieciu).getText();
       return komunikat;
    }


}
