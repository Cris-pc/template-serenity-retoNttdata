package tasks;

import groovy.util.logging.Log;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.sauceDemoPage;

public class Login implements Task {
    private String usuario;
    private String contrasena;


    public Login(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(usuario).into(sauceDemoPage.TXT_USER));
        actor.attemptsTo(Enter.theValue(contrasena).into(sauceDemoPage.TXT_PASS));
        actor.attemptsTo(Click.on(sauceDemoPage.BTN_INGRESAR));
    }
    public static Login enter(String usuario, String contrasena) {
        return Tasks.instrumented(Login.class, usuario, contrasena);
    }
}
