package screenplay.user_interfaces;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;

public class LoginForm extends PageObject {

    public static Target FILL_USERNAME = Target.the("Fill user name").locatedBy("#email");
    public static Target FILL_PASSWORD = Target.the("Fill password").locatedBy("#passwd");
    public static Target SIGN_IN = Target.the("Submit login").locatedBy("#SubmitLogin");

}
