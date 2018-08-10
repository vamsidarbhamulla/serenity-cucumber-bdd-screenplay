package features.user_account;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import features.steps.LoginSteps;
import org.junit.Assert;

public class UserLoginStepDef {

    @Steps
    private LoginSteps carla;

    @Given("Carla is a registered member$")
    public void carla_is_a_registered_member(){
        Assert.assertTrue(carla.shouldSignIn());
    }

    @When("she logs in with valid credentials$")
    public void carla_has_signed_in_with_her_account(){
        carla.signIn();
    }

    @Then("she should be able to view her account profile$")
    public void carla_should_be_able_to_view_her_account_profile(){
        carla.should_be_able_to_view_her_account_profile();
    }
}
