package features.steps;

import net.thucydides.core.annotations.Step;

public class LoginSteps { // #TODO Replace class name with a better suitable name


    
    @Step
    public void signIn() {
    }

    @Step
    public boolean shouldSignIn() {
        // For ideal applications this should be Login REST API response check
        // For legacy applications without REST END POINT  we can check db table for account data
        // As we can't access DB or REST API for our testing website we can default it to true
        // But make sure you have an account created before calling this method
        return true;
    }

    @Step
    public void should_be_able_to_view_her_account_profile() {
    }
}
