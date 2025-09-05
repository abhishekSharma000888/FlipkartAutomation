package utils;

public class WebDriverFactory {
    public static WebDriver createDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions opts = new ChromeOptions();
        opts.addArguments("--start-maximized");
        return new ChromeDriver(opts);
    }
}
