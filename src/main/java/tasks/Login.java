package tasks;

import groovy.util.logging.Log;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.sauceDemoPage;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("standard_user").into(sauceDemoPage.TXT_USER));
        actor.attemptsTo(Enter.theValue("secret_sauce").into(sauceDemoPage.TXT_PASS));
        actor.attemptsTo(Click.on(sauceDemoPage.BTN_INGRESAR));
    }
    public static Login enter()
    {
        return Tasks.instrumented(Login.class);
    }
}
