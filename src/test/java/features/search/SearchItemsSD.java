package features.search;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import screenplay.questions.SearchResults;
import screenplay.tasks.NavigateMenu;
import screenplay.tasks.SearchAnItem;
import screenplay.tasks.Start;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static screenplay.questions.ElementAvailability.Available;

public class SearchItemsSD {

    @Before
    public void set_the_stage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that (.*) wants to buy (?:Blouse|an item)$")
    public void carla_wants_to_buy_T_shirt(String actor) {
        theActorCalled(actor).wasAbleTo(Start.readyToSearch());
    }

    @When("^s?he searches for (.*) using the navigation menu$")
    public void she_searches_for_T_shirts_using_the_navigation_menu(List<String> keywords) {
        theActorInTheSpotlight().attemptsTo(NavigateMenu.toBlousesItem());
    }

    @When("^s?he searches for keyword (.*)$")
    public void she_searches_for_keywords_using_the_navigation_menu(List<String> keywords) {
        theActorInTheSpotlight().attemptsTo(SearchAnItem.with(keywords.get(0)));
    }

    @Then("^s?he should see the list of (.*) with prices available for sale$")
    public void she_should_see_the_list_of_items_with_prices_available_for_sale(List<String> items)  {
        theActorInTheSpotlight().should(
                seeThat(SearchResults.resultsGrid(), is(Available)),
                seeThat(SearchResults.checkForTitle(), containsString(items.get(0))),
                seeThat(SearchResults.price(), is(Available))
        );
    }
}
