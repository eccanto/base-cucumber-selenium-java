package pages.duckduckgo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    private static final String BASE_URL = "https://duckduckgo.com/";

    private static final String CSS_INPUT_SEARCH = "#searchbox_input";
    private static final String XPATH_BUTTON_SEARCH =
            "//*[@id='searchbox_homepage']//button[@type='submit']";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL);
    }

    public void fillSearch(String text) {
        final WebElement input = driver.findElement(By.cssSelector(CSS_INPUT_SEARCH));
        input.sendKeys(text);
    }

    public void search() {
        final WebElement button = driver.findElement(By.xpath(XPATH_BUTTON_SEARCH));
        button.click();
    }
}
