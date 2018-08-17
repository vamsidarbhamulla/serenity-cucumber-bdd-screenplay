package screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Visibility;

import static net.serenitybdd.screenplay.questions.ValueOf.the;
import static screenplay.user_interfaces.SearchResultsPage.SEARCH_RESULTS_GRID;

@Subject("the 'Search Results' view")
public class SearchResultsGrid implements Question<ElementAvailability> {

    @Override
    public ElementAvailability answeredBy(Actor actor) {
        return ElementAvailability.from(
                the(Visibility.of(SEARCH_RESULTS_GRID).viewedBy(actor))
        );
    }
}
