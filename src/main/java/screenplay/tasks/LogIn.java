package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import screenplay.abilities.Authenticate;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static screenplay.user_interfaces.LoginForm.*;

public class LogIn implements Task {

    @Step("Logs in loaded {0}")
    public static LogIn withCredentials(){
        return instrumented(LogIn.class);
    }

    @Step
    public <T extends Actor> void performAs(T user) {
        user.attemptsTo(
                Enter.theValue(authenticated(user).username())
                    .into(FILL_USERNAME),
                Enter.theValue(authenticated(user).password())
                    .into(FILL_PASSWORD),
                Click.on(SIGN_IN)
        );
    }

    private Authenticate authenticated(Actor actor) {
       return Authenticate.as(actor);
    }

}
