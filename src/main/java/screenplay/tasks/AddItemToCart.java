package screenplay.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hover;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;
import screenplay.user_interfaces.QuickViewPopup;
import screenplay.user_interfaces.SearchResultsPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.valueOf;

public class AddItemToCart {

    public static Task fromSearchResultsPage(){
        return Task.where("Add item to Cart",
                Hover.over(SearchResultsPage.FIRST_PRODUCT_PRICE),
                Check.whether(
                        valueOf(SearchResultsPage.QUICK_VIEW_LINK),isCurrentlyEnabled())
                        .andIfSo( Hover.over(SearchResultsPage.QUICK_VIEW_LINK)),
                Click.on(SearchResultsPage.QUICK_VIEW_LINK),
                Click.on(QuickViewPopup.SELECT_ITEM_COLOR),
                Click.on(QuickViewPopup.ADD_ITEM_TO_CART)
        );
    }
}
