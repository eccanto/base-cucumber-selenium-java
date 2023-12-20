package stepDefinitions;

import hooks.DriverManager;
import io.cucumber.java.en.Then;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonSteps {
    private final DriverManager driverManager;

    public CommonSteps(DriverManager webDriverManager) {
        this.driverManager = webDriverManager;
    }

    @Then("I see {string} in the title")
    public void checkTitle(String title) {
        new WebDriverWait(driverManager.getDriver(), Duration.ofSeconds(10))
                .until(
                        new ExpectedCondition<Boolean>() {
                            public Boolean apply(WebDriver driver) {
                                return driver.getTitle().contains(title);
                            }
                        });
    }
}
