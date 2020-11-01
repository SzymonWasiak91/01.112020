package Framework.Pages.Allegro;

import Framework.Base.DriverManager;
import Framework.Utils.Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page4 {
    @FindBy(xpath = "/html/body/div[2]/div[4]/div/div/div/div/div/div/div/div[1]/div/app-root/cart/div/div/section/seller-offers/div[2]/item/div/div/offer-row/div/div[3]/number-picker/div/div/div/input")
    private WebElement coutNumberInput;
    @FindBy(xpath = "//i[@title='usuń przedmiot']")
    private WebElement deletItemButton;
    @FindBy(xpath = "/html/body/div[2]/div[4]/div/div/div/div/div/div/div/div[1]/div/app-root/render-html-once[1]/div[2]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/h2/span")
    private WebElement textTwojKoszykJestPusty;


    WebDriver driver = DriverManager.getWebDriver();
    Methods methods = new Methods(driver);


    public Page4() {
        PageFactory.initElements(driver, this);
        this.methods = methods;

    }

    public void clickAndSetCountInput(String countSize) {
        methods.waintUntilElemenClicable(coutNumberInput);
        coutNumberInput.click();
        coutNumberInput.clear();
        coutNumberInput.sendKeys(countSize);
    }

    public void deleteItem() {
        methods.moetToWebelement(deletItemButton);
        methods.waintUntilElemenClicable(deletItemButton);
        deletItemButton.click();
    }

    public String getLastText() {
        methods.waintUntilElementVisible(textTwojKoszykJestPusty);
        methods.moetToWebelement(textTwojKoszykJestPusty);
        String text = textTwojKoszykJestPusty.getText();
        return text;

    }
}
