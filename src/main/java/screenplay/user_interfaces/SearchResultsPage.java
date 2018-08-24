package screenplay.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchResultsPage extends PageObject {

    public static Target SEARCH_RESULTS_GRID = Target.the("Search results grid")
            .locatedBy("#products");
    public static Target FIRST_PRODUCT_PRICE = Target.the("Products price list")
            .locatedBy("#js-product-list > div.products.row > article:nth-child(1) > div > div.product-description > div > span.price");
    public static Target SEARCH_RESULTS_TITLE = Target.the("Search results title")
            .locatedBy("#js-product-list-top > div.col-md-6.hidden-sm-down.total-products > p");

    public static Target FIRST_MATCHED_ITEM = Target.the("First Item Name") // #TODO Make it generic to work for any item
            .locatedBy("#js-product-list > div.products.row > article:nth-child(1) > div > div.product-description > h2 > a");
    public static Target QUICK_VIEW_LINK = Target.the("Quick view link")
            .locatedBy("#js-product-list > div.products.row > article:nth-child(1) > div > div.highlighted-informations.hidden-sm-down > a");
    public static Target FIRST_MATCHED_PRODUCT_PRICE = Target.the("Products price list") // #TODO Make it generic to work for any item
            .locatedBy("#js-product-list > div.products.row > article:nth-child(1) > div > div.product-description > div > span.price");

}
