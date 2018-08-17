package screenplay.user_interfaces;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;

public class GlobalHeader extends PageObject {

    @FindBy(css=".btn.btn-default.button-search")
    public static WebElementFacade SEARCH_BTN;

    public static Target SEARCH_BAR = Target.the("Search bar field")
            .locatedBy("#search_query_top");
}
