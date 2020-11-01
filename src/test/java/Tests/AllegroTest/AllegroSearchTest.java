package Tests.AllegroTest;

import Framework.Pages.Allegro.Page1;
import Framework.Pages.Allegro.Page2;
import Framework.Pages.Allegro.Page3;
import Framework.Pages.Allegro.Page4;
import Tests.BaseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllegroSearchTest {
    @Test
    public void testDriver() throws InterruptedException {

    BaseTest baseTest = new BaseTest();
    baseTest.setUp("chrome");
        Page1 page1 = new Page1();
        page1.getURL("https://allegro.pl/");
        page1.clickSearchButton();
        page1.searchItem("buty");
        Page2 page2 = new Page2();
        page2.setView();
        page2.setPriceRange("100","150");
        page2.clicToFirstItem();
        Page3 page3 = new Page3();
        page3.clickAddCartButton();
        page3.clickAddToCartButton();
        Page4 page4 = new Page4();
        page4.clickAndSetCountInput("10");
        page4.deleteItem();
        String text1 = page4.getLastText();
        Assert.assertEquals(text1,"Twój koszyk jest pusty");





      //  baseTest.tearDown();

    }
}
