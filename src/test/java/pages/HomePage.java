package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "button._2KpZ6l")
    WebElement loginPopupClose;
    @FindBy(name = "q")
    WebElement searchField;
    public void closeLoginPopup() { try { loginPopupClose.click(); } catch (Exception ignored) {} }
    public void search(String query) { searchField.sendKeys(query, Keys.ENTER); }
}
