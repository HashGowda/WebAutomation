package PumaTest;

import FrameWorkC.BaseClass;
import org.testng.annotations.Test;

public class TestCase extends PumaLogin {

    @Test
    public void searchPage(){
        SearchPage searchPage = new SearchPage(driver);
        searchPage.search();
    }
}
