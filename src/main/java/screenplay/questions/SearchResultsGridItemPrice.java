package screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Visibility;

import static net.serenitybdd.screenplay.questions.ValueOf.the;
import static screenplay.user_interfaces.SearchResultsPage.FIRST_PRODUCT_PRICE;

@Subject("Check 'Results Grid Item Price' ")
public class SearchResultsGridItemPrice implements Question<ElementAvailability> {

    @Override
    public ElementAvailability answeredBy(Actor actor) {
        return ElementAvailability.from(
                the(Visibility.of(FIRST_PRODUCT_PRICE)
                        .viewedBy(actor))
        );
    }
}
