package screenplay.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static screenplay.user_interfaces.GlobalHeaderNavigationBar.GET_LOGIN_SCREEN;

public class GoToLogin {

     public static Task called () {
       return Task.where("Go To Login screen",
               Click.on(GET_LOGIN_SCREEN));
    }
}
