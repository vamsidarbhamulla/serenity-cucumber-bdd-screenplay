package screenplay.abilities;

import screenplay.exceptions.CannotAuthenticateException;
import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;

public class Authenticate implements Ability {

    private final String username;
    private final String password;

    // instantiates the Ability and enables fluent DSL
    public static Authenticate with(String username,String password){
        return new Authenticate(username, password);
    }

    public static Authenticate as(Actor actor) throws CannotAuthenticateException {
        // complain if someone's asking the impossible
        if(actor.abilityTo(Authenticate.class) == null){
            throw new CannotAuthenticateException(actor.getName());
        }

        return actor.abilityTo(Authenticate.class);
    }

    public String username() {
        return username;
    }

    public String password() {
        return password;
    }

    private Authenticate(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
