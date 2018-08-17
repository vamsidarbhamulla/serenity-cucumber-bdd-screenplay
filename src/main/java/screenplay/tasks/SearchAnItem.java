package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static screenplay.user_interfaces.GlobalHeader.SEARCH_BAR;

public class SearchAnItem implements Task {

    private String keyword;

    public static SearchAnItem with(String keyword){
        return instrumented(SearchAnItem.class, keyword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(keyword)
                        .into(SEARCH_BAR)
                        .thenHit(Keys.ENTER)
        );
    }

    public SearchAnItem(String keyword) {
        this.keyword = keyword;
    }

}
