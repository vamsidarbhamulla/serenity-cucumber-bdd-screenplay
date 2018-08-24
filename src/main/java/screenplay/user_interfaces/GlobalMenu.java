package screenplay.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GlobalMenu extends PageObject {

    public static Target CLOTHES = Target.the("Clothes Top Menu Option").locatedBy("#category-3 > a");
    public static Target WOMEN = Target.the("Women Menu Option under clothes").locatedBy("#category-5 > a");

}
