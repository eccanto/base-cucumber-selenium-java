package stepDefinitions.duckduckgo;

import hooks.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.duckduckgo.HomePage;
import pages.duckduckgo.SearchPage;

public class SearchSteps {
    private final HomePage homePage;
    private final SearchPage searchPage;

    public SearchSteps(DriverManager webDriverManager) {
        this.homePage = new HomePage(webDriverManager.getDriver());
        this.searchPage = new SearchPage(webDriverManager.getDriver());
    }

    @Given("I go to the Duckduckgo page")
    public void loadDuckduckgoPage() {
        homePage.open();
    }

    @Given("I fill the search input with the {string} term on the Search Engine page")
    public void fullSerachengine(String text) {
        homePage.fillSearch(text);
    }

    @When("I click on the search button on the Search Engine page")
    public void search() {
        homePage.search();
    }

    @Then("the text {string} should be visible on the result page on the Search Engine page")
    public void checkContent(String text) {
        searchPage.resultContain(text);
    }
}
