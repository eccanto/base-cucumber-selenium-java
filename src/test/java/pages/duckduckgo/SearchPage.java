package pages.duckduckgo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BasePage {
    private static final String CSS_RESULT_SEARCH = "#react-layout [data-testid='mainline']";

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void resultContain(String text) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(
                        new ExpectedCondition<Boolean>() {
                            public Boolean apply(WebDriver driver) {
                                final String content =
                                        driver.findElement(By.cssSelector(CSS_RESULT_SEARCH))
                                                .getText();
                                return content.contains(text);
                            }
                        });
    }
}
