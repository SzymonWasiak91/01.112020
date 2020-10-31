package Tests.AllegroSearchTest;

import Framework.Pages.Allegro.Page1;
import Framework.Pages.Allegro.Page2;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

public class SearchTest {


    @Test
    public void testDriver()  {
        BaseTest.setUp("Chrome");
        Page1 page1 = new Page1();
        page1.getURL("https://www.allegro.pl");
        page1.clickButtonPrzejdzDalej();
        page1.searchItem("Kalosze");



        Page2 page2 = new Page2();




       // BaseTest.tearDown();


    }
}
