package stepsdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.ClaseAssertText;
import tasks.Login;
import tasks.ProcesoCompra;

import java.util.List;

public class LoginStepDefinition {

    @Managed /*defino que driver voy a utilizar*/
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

     String user="";
    String pass="";

    @Given("el usuario ingresa a la pagina web")
    public void elUsuarioIngresaALaPaginaWeb() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/ "));
    }

    @When("El usuario ingresa las credenciales de manera correcta")
    public void elUsuarioIngresaLasCredencialesDeManeraCorrecta(DataTable userInfo) {
        List<List<String>> rows = userInfo.asLists(String.class);
        for(List<String> columns:rows){
            user=columns.get(0);
            pass=columns.get(1);
        }
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enter(user, pass)); // Usamos el método withCredentials aquí
        OnStage.theActorInTheSpotlight().attemptsTo(ProcesoCompra.enter());  // Aquí sigue la compra
    }

    @Then("El usuario ingresa al home a realizar la compra de 2 productos")
    public void ElUsuarioIngresaAlHomeARealizarLaCompraDe2Productos() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ClaseAssertText.esIgual(), Matchers.is("Thank you for your order!")));
    }


}
