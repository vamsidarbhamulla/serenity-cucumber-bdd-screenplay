package features.user_account;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import screenplay.abilities.Authenticate;
import screenplay.questions.UserAccount;
import screenplay.tasks.LogIn;
import screenplay.tasks.Start;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.ConsequenceMatchers.displays;
import static org.hamcrest.Matchers.equalTo;

public class UserLoginStepDef {

    private static final String userName = "test_account@getnada.com";
    private static final String password =  "password";

    @Before
    public void set_the_stage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Carla is a registered member$")
    public void carla_is_a_registered_member(){
        theActorCalled("carla")
                .whoCan(Authenticate.with(userName, password))
                .wasAbleTo(Start.prepareToSignIn());
    }

    @When("she logs in with valid credentials$")
    public void carla_has_signed_in_with_her_account(){
        theActorInTheSpotlight()
                .can(Authenticate.with(userName, password))
                .attemptsTo(LogIn.withCredentials());
    }

    @Then("she should be able to view her account profile$")
    public void carla_should_be_able_to_view_her_account_profile(){
        theActorInTheSpotlight()
                .should(seeThat(UserAccount.loaded(),
                        displays("title", equalTo("My account - My Store"))));
    }
}
