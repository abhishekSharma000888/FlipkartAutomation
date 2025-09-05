package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage {
    @FindBy(css = "a._1fQZEK")
    List<WebElement> productLinks;
    public void clickFirstProduct() { productLinks.get(0).click(); }
}
