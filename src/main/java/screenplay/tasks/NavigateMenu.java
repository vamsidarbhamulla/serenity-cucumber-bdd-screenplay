package screenplay.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hover;
import screenplay.user_interfaces.GlobalMenu;

public class NavigateMenu {

     public static Task toBlousesItem(){
        return Task.where("Navigate Menu to blouses option",
                Hover.over(GlobalMenu.WOMEN)
                ,Hover.over(GlobalMenu.BLOUSES),
                Click.on(GlobalMenu.BLOUSES));
    }
}
