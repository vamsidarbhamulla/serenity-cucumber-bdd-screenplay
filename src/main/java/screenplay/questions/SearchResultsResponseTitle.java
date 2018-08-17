package screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;

import static screenplay.user_interfaces.SearchResultsPage.SEARCH_RESULTS_TITLE;

public class SearchResultsResponseTitle implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Attribute.of(SEARCH_RESULTS_TITLE).named("Search results title")
                .viewedBy(actor)
                .asString();
    }

}
