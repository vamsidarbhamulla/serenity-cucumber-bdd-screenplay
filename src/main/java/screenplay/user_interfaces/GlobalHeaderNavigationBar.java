package screenplay.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Platform;
import screenplay.questions.RunEnvironment;

//@DefaultUrl("http://localhost:90")
public class GlobalHeaderNavigationBar extends PageObject {

    private static Target GET_LOGIN_SCREEN =Target.the("Desktop Sign In Button")
            .locatedBy("#_desktop_user_info > div > a");
    //public static By GET_LOGIN_SCREEN = By.jquery("#_desktop_user_info > div > a > span");

    public static Target getLoginScreen() {
        if (RunEnvironment.ofValue() == RunEnvironment.Mobile)
        {
            GET_LOGIN_SCREEN = Target.the("Mobile Sign In Button")
                    .locatedBy("#_mobile_user_info > div > a");
        }
        return GET_LOGIN_SCREEN;
    }
}
