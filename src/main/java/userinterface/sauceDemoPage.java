package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class sauceDemoPage {
    public static final Target TXT_USER = Target.the("TXT de ingreso de usuario").located(By.id("user-name"));
    public static final Target TXT_PASS = Target.the("TXT de ingreso de contraseña").located(By.id("password"));
    public static final Target BTN_INGRESAR = Target.the("BTN LOGIN").located(By.id("login-button"));
    public static final Target PRODUCTO1 = Target.the("ELEMENTO PRODUCTO 1").located(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
    public static final Target PRODUCTO2 = Target.the("ELEMENTO PRODUCTO 2").located(By.id("add-to-cart-sauce-labs-fleece-jacket"));
    public static final Target CARRITO = Target.the("ELEMENTO PRODUCTO 2").locatedBy("//*[@id=\"shopping_cart_container\"]/a");
    public static final Target BTNcHECKOUT = Target.the("CLIC EN BTN CHECKOUT").located(By.id("checkout"));
    public static final Target FIRSTNAME = Target.the("TXT de ingreso de NOMBRE").located(By.id("first-name"));
    public static final Target LASTNAME = Target.the("TXT de ingreso de APELLIDO").located(By.id("last-name"));
    public static final Target POSTALCODE = Target.the("TXT de ingreso de CODIGO POSTAL").located(By.id("postal-code"));
    public static final Target CONTINUAR = Target.the("CLIC EN CONTINUAR").located(By.id("continue"));
    public static final Target FIN = Target.the("CLIC EN FIN").located(By.id("finish"));
    public static final Target VALIDACION_TEXTO = Target.the("TXT de ingreso de CODIGO POSTAL").locatedBy("//*[text()='Thank you for your order!']");

}
