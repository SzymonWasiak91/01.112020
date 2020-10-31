package Framework.Pages.Ebay;

import Framework.Base.DriverManager;
import Framework.Utils.Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class Page2 {
    @FindBy(xpath = "//*[@class='s-item__price']")
    private List<WebElement> priceList;






    private WebDriver driver = DriverManager.getWebDriver();
    private Methods methods;

    public Page2(){
        PageFactory.initElements(driver,this);
         this.methods = new Methods(driver);
    }

    public int getPriceListNumber(){
        methods.waintUntilListVisible(priceList);
        int sizeList = priceList.size();
        return sizeList;

    }
    public void getPricesValue(){
        methods.waintUntilListVisible(priceList);
        for(WebElement price:priceList){
            System.out.println(price.getText());
        }


    }
    public void webElementToString(){
        List<String>strings = new ArrayList<>();
        for(WebElement element: priceList){
            strings.add(element.getText());
        }
        List<String> replacesItem = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++){
            String str = strings.get(i).substring(0,strings.get(i).length()-2);
            replacesItem.add(str);
        }
        System.out.println(replacesItem);
    }











}
