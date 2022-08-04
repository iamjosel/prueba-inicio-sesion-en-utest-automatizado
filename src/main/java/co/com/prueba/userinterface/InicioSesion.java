package co.com.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioSesion {
    public static final Target INGRESE_USUARIO = Target.the("Ingrese Usuario")
            .located(By.id("username"));
    public static final Target INGRESE_CLAVE = Target.the("Ingrese su clave")
            .located(By.id("password"));
    public static final Target RECUERDAME = Target.the("Recuerda mi usuario")
            .located(By.id("rememberMe"));
    public static final Target BOTON_INGRESO = Target.the("Botón de ingreso")
            .located(By.id("kc-login"));

}

