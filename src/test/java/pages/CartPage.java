package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    private final WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a._3SkBxJ")
    WebElement cartLink;
    @FindBy(css = "a._3i47xR")
    WebElement productNameDisplay;

    public void openCart() {
        cartLink.click();
    }

    public boolean isProductInCart(String productName) {
        return productNameDisplay.getText().contains(productName);
    }

    public void removeFirstProduct() {
    }



}
