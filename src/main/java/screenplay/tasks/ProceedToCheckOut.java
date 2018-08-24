package screenplay.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;
import screenplay.user_interfaces.CheckoutSummary;
import screenplay.user_interfaces.QuickViewPopup;
import screenplay.user_interfaces.ShoppingCartSummary;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.valueOf;

public class ProceedToCheckOut {

    public static Task fromQuickViewPopup(){
        return Task.where("Proceed to checkout from cart status popup",
                Scroll.to(QuickViewPopup.PROCEED_TO_CHECKOUT),
                Click.on(QuickViewPopup.PROCEED_TO_CHECKOUT)
        );
    }

    public static Task fromCartSummaryPopup(){
        return Task.where("Proceed to checkout from cart status popup",
                Scroll.to(ShoppingCartSummary.PROCEED_TO_CHECKOUT),
                Click.on(ShoppingCartSummary.PROCEED_TO_CHECKOUT)
        );
    }

    public static Task fromCheckoutSummary(){
        return Task.where("Proceed to checkout from cart status popup",
                Scroll.to(CheckoutSummary.ADDRESSES_STEP),
                Click.on(CheckoutSummary.ADDRESSES_STEP),
                Click.on(CheckoutSummary.CONTNUE_TO_SHIPPING),
                //Click.on(CheckoutSummary.SHIPPING_STEP),
                Check.whether(
                        valueOf(CheckoutSummary.SHIPPING_CARRIER),isCurrentlyEnabled())
                        .andIfSo(Click.on(CheckoutSummary.SHIPPING_CARRIER)),
                Click.on(CheckoutSummary.CONTNUE_TO_PAYMENT),
                Check.whether(
                        valueOf(CheckoutSummary.PAY_BY_BANK_WIRE),isCurrentlyVisible())
                        .andIfSo(Click.on(CheckoutSummary.PAY_BY_BANK_WIRE))
        );
    }

}
