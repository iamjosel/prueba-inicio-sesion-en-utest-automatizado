package co.com.prueba.tasks;

import co.com.prueba.model.SesionDatos;
import co.com.prueba.userinterface.InicioSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import java.util.List;

public class LlenarSesion implements Task {
    private List<SesionDatos> datos;

    public LlenarSesion(List<SesionDatos> datos) {
        this.datos = datos;
    }

    public static LlenarSesion laPagina(List<SesionDatos> datos){
        return Tasks.instrumented(LlenarSesion.class, datos);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrUsuario()).into(InicioSesion.INGRESE_USUARIO),
                Enter.theValue(datos.get(0).getStrClave()).into(InicioSesion.INGRESE_CLAVE),
                Click.on(InicioSesion.RECUERDAME),
                Click.on(InicioSesion.BOTON_INGRESO));

    }
}
