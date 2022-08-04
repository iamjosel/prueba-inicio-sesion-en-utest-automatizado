package co.com.prueba.tasks;

import co.com.prueba.userinterface.PageUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class Iniciar implements Task {

    private PageUtest page;

    public static Iniciar laPagina() {
        return Tasks.instrumented(Iniciar.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(page),
                Click.on(PageUtest.BUTTON_LOGIN));
    }
}
