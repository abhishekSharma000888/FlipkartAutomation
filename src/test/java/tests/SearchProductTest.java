package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultsPage;

public class SearchProductTest extends BaseTest {

    @Test
    public void testProductSearch() {
        HomePage home = new HomePage(driver);
        home.closeLoginPopup();
        String searchItem = "headphones";
        home.search(searchItem);

        SearchResultsPage results = new SearchResultsPage(driver);
    }
}
