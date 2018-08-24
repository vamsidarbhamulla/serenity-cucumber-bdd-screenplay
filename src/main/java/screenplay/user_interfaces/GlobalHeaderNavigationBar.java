package screenplay.user_interfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://localhost:900")
public class GlobalHeaderNavigationBar extends PageObject {

    public static By GET_LOGIN_SCREEN = By.jquery("#_desktop_user_info > div > a > span");

}
