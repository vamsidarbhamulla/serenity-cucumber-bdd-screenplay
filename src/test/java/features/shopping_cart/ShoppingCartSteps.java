package features.shopping_cart;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import screenplay.questions.CartSummary;
import screenplay.questions.Checkout;
import screenplay.tasks.AddItemToCart;
import screenplay.tasks.ProceedToCheckOut;
import screenplay.tasks.SearchAnItem;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsString;

public class ShoppingCartSteps {

    @Before
    public void set_the_stage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(?:he) has placed the following items in his shopping cart:$")
    public void User_has_placed_the_following_items_in_his_shopping_cart(DataTable orderDetails) {
        theActorInTheSpotlight().has(SearchAnItem.with(orderDetails.raw().get(1 ).get(0)));
        theActorInTheSpotlight().attemptsTo(AddItemToCart.fromSearchResultsPage());
    }


    @When("^he proceeds to the checkout$")
    public void he_proceeds_to_the_checkout() {
        theActorInTheSpotlight().attemptsTo(ProceedToCheckOut.fromQuickViewPopup());
    }

    @Then("^he should see a summary of the items he wants to order:$")
    public void he_should_see_a_summary_of_the_items_he_wants_to_order(DataTable arg1)  {
        theActorInTheSpotlight().should(
                seeThat(CartSummary.itemAttributes(), contains("Color: Black")),
                seeThat(CartSummary.itemName(), containsString("Brown bear cushion"))
        );
    }

    @Then("^he should see the total cost including shipping:$")
    public void he_should_see_the_total_cost_including_shipping(DataTable arg1) {
        theActorInTheSpotlight().attemptsTo(ProceedToCheckOut.fromCartSummaryPopup());
        theActorInTheSpotlight().attemptsTo(ProceedToCheckOut.fromCheckoutSummary());
        theActorInTheSpotlight().should(
                seeThat(Checkout.totalPrice(), containsString(arg1.raw().get(1).get(2)))
        );
    }

}
