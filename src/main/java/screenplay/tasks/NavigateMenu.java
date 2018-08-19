package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hover;
import net.serenitybdd.screenplay.conditions.Check;
import screenplay.user_interfaces.GlobalMenu;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.valueOf;

public class NavigateMenu {

     public static Task toBlousesItem(){
        return Task.where("Navigate Menu to blouses option",
                Hover.over(GlobalMenu.WOMEN),
                Check.whether(
                        valueOf(GlobalMenu.WOMEN),isVisible())
                        .andIfSo( Hover.over(GlobalMenu.WOMEN)),
                Check.whether(
                        valueOf(GlobalMenu.BLOUSES),isVisible())
                        .andIfSo( Hover.over(GlobalMenu.BLOUSES))
                        .andIfSo(Click.on(GlobalMenu.BLOUSES))

        );

    }

}
