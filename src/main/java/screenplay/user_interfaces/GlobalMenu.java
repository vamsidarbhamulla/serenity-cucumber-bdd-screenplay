package screenplay.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GlobalMenu extends PageObject {

    public static Target WOMEN = Target.the("Women Top Menu Option").locatedBy("#block_top_menu > ul > li:nth-child(1) > a");
    public static Target  BLOUSES = Target.the("Blouses Menu Option under Women").locatedBy("#block_top_menu > ul > li:nth-child(1) > ul > li:nth-child(1) > ul > li:nth-child(2) > a");

}
