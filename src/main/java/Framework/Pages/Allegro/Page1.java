package Framework.Pages.Ebay;

import Framework.Base.DriverManager;
import Framework.Utils.Methods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {


    @FindBy(xpath = "//*[@id='gh-ac']")
    private WebElement inputsearch;





    private WebDriver driver = DriverManager.getWebDriver();
    private Methods methods;

    public Page1() {
        PageFactory.initElements(driver, this);
        this.methods = new Methods(driver);

    }
    public void getURL(String url){
        driver.get(url);
    }

    public void searchItem() {
        methods.waintUntilElemenClicable(inputsearch);
        inputsearch.click();
        inputsearch.clear();
        inputsearch.sendKeys("tshirt");
        inputsearch.sendKeys(Keys.ENTER);
    }



}



