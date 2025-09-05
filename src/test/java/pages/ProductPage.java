package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {

    @FindBy(css = "button._2KpZ6l")
    WebElement addToCart;
    public void addToCart() {
        addToCart.click();
    }
}
