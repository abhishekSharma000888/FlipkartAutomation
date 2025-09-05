package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
    @FindBy(css = "a._3SkBxJ")
    WebElement cartLink;
    @FindBy(css = "a._3i47xR")
    WebElement productNameDisplay;
    public void openCart() { cartLink.click(); }
    public boolean isProductInCart(String productName) {
        return productNameDisplay.getText().contains(productName);
    }
}
