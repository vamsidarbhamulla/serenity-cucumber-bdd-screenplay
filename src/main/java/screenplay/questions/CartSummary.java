package screenplay.questions;

import net.serenitybdd.screenplay.questions.targets.TargetText;
import net.serenitybdd.screenplay.questions.targets.TargetTextValues;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import screenplay.user_interfaces.ShoppingCartSummary;

public class CartSummary {

    public static TargetTextValues itemAttributes(){
        return TheTarget.textValuesOf(ShoppingCartSummary.ITEM_ATTRIBUTES).withNoSurroundingWhiteSpace();
    }

   public static TargetText itemName(){
        return TheTarget.textOf(ShoppingCartSummary.ITEM_NAME);
   }
}
