package Framework.Pages.Allegro;

import Framework.Base.DriverManager;
import Framework.Utils.Methods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2 {
    @FindBy(xpath = "/html/body/div[2]/div[4]/div/div/div/div/div/div[2]/div[1]/div[2]/div[4]/i")
    private WebElement changeViewButton;
    @FindBy(xpath = "/html/body/div[2]/div[4]/div/div/div/div/div/div[2]/div[2]/div[1]/div[3]/div/div/div/div/div/fieldset[4]/form/div[2]/div[1]/input")
    private WebElement priceOd;
    @FindBy(xpath = "/html/body/div[2]/div[4]/div/div/div/div/div/div[2]/div[2]/div[1]/div[3]/div/div/div/div/div/fieldset[4]/form/div[2]/div[3]/input")
    private WebElement priceDo;

    private WebDriver driver = DriverManager.getWebDriver();
    private Methods methods = new Methods(driver);


    public Page2() {
        PageFactory.initElements(driver, this);
        this.methods = methods;
    }


    public void setView() {
        methods.waintUntilElemenClicable(changeViewButton);
        changeViewButton.click();
    }

    public void setPriceRange(String odCena, String doCena) {
        methods.waintUntilElemenClicable(priceOd);
        priceOd.click();
        priceOd.sendKeys(odCena);
        priceOd.sendKeys(Keys.ENTER);
        methods.waintUntilElemenClicable(priceDo);
        priceDo.click();
        priceDo.sendKeys(doCena);
        priceDo.sendKeys(Keys.ENTER);


    }
}
