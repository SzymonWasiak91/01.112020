package Tests.AllegroTest;

import Framework.Pages.Allegro.Page1;
import Framework.Pages.Allegro.Page2;
import Tests.BaseTest.BaseTest;
import org.testng.annotations.Test;

public class AllegroSearchTest {
    @Test
    public void testDriver() throws InterruptedException {

    BaseTest baseTest = new BaseTest();
    baseTest.setUp("chrome");
        Page1 page1 = new Page1();
        page1.getURL("https://allegro.pl/");
        page1.clickSearchButton();
        page1.searchItem("Cipka");
        Page2 page2 = new Page2();
        page2.setView();
        page2.setPriceRange("100","150");




      //  baseTest.tearDown();

    }
}
