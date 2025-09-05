package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchResultsPage;

public class SearchAddToCartTest extends BaseTest {
    @Test
    public void testSearchAndAddToCart() throws InterruptedException {
        HomePage home = new HomePage(driver);
        home.closeLoginPopup();
        String searchItem = "laptop";
        home.search(searchItem);

        SearchResultsPage results = new SearchResultsPage(driver);
        results.clickFirstProduct();

        ProductPage product = new ProductPage(driver);
        product.addToCart();

        CartPage cart = new CartPage(driver);
        cart.openCart();

        Assert.assertTrue(cart.isProductInCart("Laptop"), "Product should appear in cart");
    }
}
