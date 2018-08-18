package screenplay.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchResultsPage extends PageObject {

    public static Target SEARCH_RESULTS_GRID = Target.the("Search results grid")
            .locatedBy(".product_list.grid.row");
    public static Target PRODUCTS_PRICE_LIST = Target.the("Products price list")
            .locatedBy("#center_column > ul > li > div > div.right-block > div.content_price > span");
    public static Target SEARCH_RESULTS_TITLE = Target.the("Search results title")
            .locatedBy("//*[@id='center_column']/h1/span[1]");
    public static Target ADD_ITEM_TO_CART = Target.the("Add item to cart")
            .locatedBy("a.button.ajax_add_to_cart_button.btn.btn-default>span");
    public static Target PROCEED_TO_CHECKOUT = Target.the("Proceed to checkout")
            .locatedBy("//*[@class='btn btn-default button button-medium'][@title='Proceed to checkout']/span");

}
