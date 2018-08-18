package screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import screenplay.user_interfaces.SearchResultsPage;


public class SearchResultsResponseTitle implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(SearchResultsPage.SEARCH_RESULTS_TITLE)
                .viewedBy(actor)
                .asString().toLowerCase();
    }
}
