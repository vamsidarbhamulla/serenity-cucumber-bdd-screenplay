package screenplay.user_interfaces;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.At;
import org.openqa.selenium.WebElement;

@At("http://automationpractice.com/index.php?controller=my-account")
public class UserAccountPage extends PageObject {

    public static Target GOTO_ORDER_HISTORY = Target.the("Go To Order History").locatedBy(".icon-list-ol");

    @FindBy(id="button_order_cart")
    public static WebElement GOTO_HOME_FROM_BOTTOM_NAV ;
}
