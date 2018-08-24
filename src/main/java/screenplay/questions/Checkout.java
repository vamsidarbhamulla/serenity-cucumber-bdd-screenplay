package screenplay.questions;

import net.serenitybdd.screenplay.questions.targets.TargetText;
import net.serenitybdd.screenplay.questions.targets.TargetTextValues;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import screenplay.user_interfaces.CheckoutSummary;
import screenplay.user_interfaces.ShoppingCartSummary;

public class Checkout {

    public static TargetText totalPrice(){
        return TheTarget.textOf(CheckoutSummary.TOTAL_PRICE);
    }
}
