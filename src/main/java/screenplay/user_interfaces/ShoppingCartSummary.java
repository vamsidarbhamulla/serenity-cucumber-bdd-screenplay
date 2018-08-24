package screenplay.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartSummary extends PageObject {

    public static Target ITEM_NAME = Target.the("textContent")
            .locatedBy("#main > div > div.cart-grid-body.col-xs-12.col-lg-8 > div > div.cart-overview.js-cart > ul > li > div > div.product-line-grid-body.col-md-4.col-xs-8 > div:nth-child(1)");

    public static Target ITEM_ATTRIBUTES = Target.the("itemAttributes")
            .locatedBy("#main > div > div.cart-grid-body.col-xs-12.col-lg-8 > div > div.cart-overview.js-cart > ul > li > div > div.product-line-grid-body.col-md-4.col-xs-8 > div:nth-child(4)");

    public static Target PROCEED_TO_CHECKOUT = Target.the("Proceed to checkout")
            .locatedBy("#main > div > div.cart-grid-right.col-xs-12.col-lg-4 > div.card.cart-summary > div.checkout.cart-detailed-actions.card-block > div > a");
}
