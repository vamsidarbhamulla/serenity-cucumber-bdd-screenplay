package screenplay.questions;

import net.serenitybdd.screenplay.Question;

public class SearchResults {

    public static Question<ElementAvailability> resultsGrid() {
        return new SearchResultsGrid();
    }

    public static Question<ElementAvailability> price() {
        return new SearchResultsGridItemPrice();
    }

    public static Question<String> checkForTitle() {
        return new SearchResultsResponseTitle();
    }
}
