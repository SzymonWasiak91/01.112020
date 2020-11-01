package Framework.Pages.Allegro;

import Framework.Base.DriverManager;
import Framework.Utils.Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3 {
    @FindBy(xpath = "//button[@id='add-to-cart-button']")
    private WebElement addCartButton;
    @FindBy(xpath = "//a[text()='przejdź do koszyka']")
    private WebElement goToCartButton;


    WebDriver driver = DriverManager.getWebDriver();
    Methods methods;

    public Page3() {
        PageFactory.initElements(driver, this);
        this.methods = new Methods(driver);
    }

    public void clickAddCartButton() {
        methods.moetToWebelement(addCartButton);
        methods.waintUntilElemenClicable(addCartButton);
        addCartButton.click();
    }

    public void clickAddToCartButton() {
        methods.moetToWebelement(goToCartButton);
        methods.waintUntilElemenClicable(goToCartButton);
        goToCartButton.click();
    }
}
