package Tests.AllegroTest;

import Framework.Pages.Allegro.Page1;
import Framework.Pages.Allegro.Page2;
import Framework.Pages.Allegro.Page3;
import Framework.Pages.Allegro.Page4;
import Tests.BaseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AllegroSearchTest {
    @Test
    @Parameters({"przedmiot", "browserName", "priceOd", "priceDo"})
    public void searchItem(String przedmiot, String browserName, String priceOd, String priceDo) throws InterruptedException {

        BaseTest baseTest = new BaseTest();
        baseTest.setUp(browserName);
        Page1 page1 = new Page1();
        page1.getURL("https://allegro.pl/");
        page1.klikButtonPrzejdzDalej();
        page1.wyszukaj(przedmiot);
        Page2 page2 = new Page2();
        page2.zakresCen(priceOd, priceDo);
        page2.zaznaczZamianeWidoku();
        page2.dodajPierwszyPrzedmiot();
        Page3 page3 = new Page3();
        page3.dodajDoKoszyka();
        page3.idzDoKoszyka();
        Page4 page4 = new Page4();
        page4.usunPrzedmiot();
        String text1 = page4.pobierzTextKoncowy();
        Assert.assertEquals(text1, "Twój koszyk jest pusty");
        baseTest.tearDown();
        baseTest.zamknijPrzegladarke();

    }
}
