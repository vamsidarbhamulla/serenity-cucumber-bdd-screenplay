package screenplay.user_interfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://automationpractice.com")
public class GlobalHeaderNavigationBar extends PageObject {

    public static By GET_LOGIN_SCREEN = By.jquery(".login");




}
