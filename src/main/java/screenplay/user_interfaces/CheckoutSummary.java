package screenplay.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutSummary {

    public static Target TOTAL_PRICE = Target.the("Addresses step")
            .locatedBy("#js-checkout-summary > div.card-block.cart-summary-totals > div.cart-summary-line.cart-total > span.value");
    public static Target ADDRESSES_STEP = Target.the("Addresses step")
            .locatedBy("#checkout-addresses-step > h1");
    public static Target CONTNUE_TO_SHIPPING = Target.the("Continue to shipping")
            .locatedBy("//*[@id=\"checkout-addresses-step\"]/div/div/form/div[2]/button");
    public static Target SHIPPING_STEP = Target.the("Addresses step")
            .locatedBy("#checkout-addresses-step > h1");
    public static Target SHIPPING_CARRIER = Target.the("Shipping carrier ")
            .locatedBy("#js-delivery > div > div.delivery-options > div.row.delivery-option > div > span > span");
    public static Target CONTNUE_TO_PAYMENT = Target.the("Continue to payment")
            .locatedBy("#js-delivery > button");
    public static Target PAY_BY_BANK_WIRE = Target.the("CheckoutSummary by wire bank")
            .locatedBy("#payment-option-2-container > span > span");
}
