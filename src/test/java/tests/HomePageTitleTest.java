package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTitleTest extends BaseTest {

    @Test
    public void testHomePageTitle() {
        HomePage home = new HomePage(driver);
        String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        Assert.assertEquals(driver.getTitle(), expectedTitle, "Home page title mismatch!");
    }
}
