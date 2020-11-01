package Framework.Pages.Allegro;

import Framework.Base.DriverManager;
import Framework.Utils.Methods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {
    @FindBy(xpath = "//button[text()='przejdź dalej']")
    private WebElement buttonPrzejdzDalej;
    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchInput;
    @FindBy(xpath = "/html/body/div[2]/div[2]/header/div/div/div/div/form/button")
    private WebElement buttonSzukaj;


    private WebDriver driver = DriverManager.getWebDriver();
    private Methods methods = new Methods(driver);


    public Page1() {
        PageFactory.initElements(driver, this);
        this.methods = methods;
    }

    public void getURL(String urlAdres) {
        driver.get(urlAdres);

    }

    public void clickSearchButton() {
        methods.waintUntilElementVisible(buttonPrzejdzDalej);
        methods.waintUntilElemenClicable(buttonPrzejdzDalej);
        buttonPrzejdzDalej.click();
    }

    public void searchItem(String item) {
        methods.waintUntilElemenClicable(searchInput);
        searchInput.click();
        searchInput.clear();
        searchInput.sendKeys(item);
        searchInput.sendKeys(Keys.ENTER);

    }


}
