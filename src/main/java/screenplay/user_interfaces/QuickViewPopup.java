package screenplay.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class QuickViewPopup extends PageObject {

    public static Target SELECT_ITEM_COLOR = Target.the("Select item color")
            .locatedBy("#group_2 > li:nth-child(2) > label > input");  // #TODO Make is generic
    public static Target ADD_ITEM_TO_CART = Target.the("Add item to cart")
            .locatedBy("#add-to-cart-or-refresh > div.product-add-to-cart > div > div.add > button");
    public static Target PROCEED_TO_CHECKOUT = Target.the("Proceed to checkout")
            .locatedBy("#blockcart-modal > div > div > div.modal-body > div > div.col-md-7 > div > div > a");
}
