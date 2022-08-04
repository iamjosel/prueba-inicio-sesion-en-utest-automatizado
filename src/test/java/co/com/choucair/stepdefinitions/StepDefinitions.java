package co.com.choucair.stepdefinitions;

import co.com.prueba.model.SesionDatos;
import co.com.prueba.tasks.Iniciar;
import co.com.prueba.tasks.LlenarSesion;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class StepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Espera que los datos esten bien$")
    public void esperaQueLosDatosEstenBien() throws Exception {
        OnStage.theActorCalled("Messi").wasAbleTo(Iniciar.laPagina());
    }


    @When("^Ingresar los datos correctamente$")
    public void ingresarLosDatosCorrectamente(List<SesionDatos> datos) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarSesion.laPagina(datos));
    }

    @Then("^Iniciar sesion exitosamente en Utest$")
    public void iniciarSesionExitosamenteEnUtest() throws Exception {

    }
}
