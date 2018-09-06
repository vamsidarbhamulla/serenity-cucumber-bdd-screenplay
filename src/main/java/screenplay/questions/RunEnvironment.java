package screenplay.questions;

import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

public enum RunEnvironment {
    Mobile, Desktop;

    public static RunEnvironment ofValue(){
        EnvironmentVariables env = SystemEnvironmentVariables.createEnvironmentVariables();
        if(env.aValueIsDefinedFor("appium.platformName")) return Mobile;
        return Desktop;
    }
}
