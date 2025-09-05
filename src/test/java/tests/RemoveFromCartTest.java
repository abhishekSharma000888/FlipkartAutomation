package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchResultsPage;

public class RemoveFromCartTest extends BaseTest {

    @Test
    public void testRemoveItemFromCart() throws InterruptedException {
        HomePage home = new HomePage(driver);
        home.closeLoginPopup();
        home.search("mobile");

        SearchResultsPage results = new SearchResultsPage(driver);
        results.clickFirstProduct();

        ProductPage product = new ProductPage(driver);
        product.addToCart();

        CartPage cart = new CartPage(driver);
        cart.openCart();
        cart.removeFirstProduct();

    }
}
