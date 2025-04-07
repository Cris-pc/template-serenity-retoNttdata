package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.sauceDemoPage;

public class ProcesoCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(sauceDemoPage.PRODUCTO1));
        actor.attemptsTo(Click.on(sauceDemoPage.PRODUCTO2));
        actor.attemptsTo(Click.on(sauceDemoPage.CARRITO));
        actor.attemptsTo(Click.on(sauceDemoPage.BTNcHECKOUT));
        actor.attemptsTo(Enter.theValue("Cristhian").into(sauceDemoPage.FIRSTNAME));
        actor.attemptsTo(Enter.theValue("Flores").into(sauceDemoPage.LASTNAME));
        actor.attemptsTo(Enter.theValue("17778").into(sauceDemoPage.POSTALCODE));
        try {
            Thread.sleep(2000); // Pausa de 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Click.on(sauceDemoPage.CONTINUAR));
        actor.attemptsTo(Click.on(sauceDemoPage.FIN));


    }
    public static ProcesoCompra enter()
    {

        return Tasks.instrumented(ProcesoCompra.class);
    }
}
