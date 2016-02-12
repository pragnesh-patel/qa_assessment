@Before
public void beforeScenario() {

Webdriver driver = new FirefoxDriver();
}

@After
public void afterScenario() {

driver.quit();
}


public class SearchByKeywordStepDefinitions {
@Steps
Search_Page searchpage(driver);

@Given("I am on the (.*) site”)
public void NavigateToSearchpage(String url) {
searchpage.goSearchPage(url);
}

@When("I search for items containing '(.*)'")
public void searchByKeyword(String keyword) {
searchpage.SearchFor(keyword);
}

@Then("I can see a list of search results relating to '(.*)'")
public void resultsForACategoryAndKeywordInARegion(String keyword) {
assert(searchpage.SearchResult(keyword) == true);
}

@Then("I should not see any results”)
public bool noResultsFound() {
assert(searchpage.noResult() == true);

}
}
