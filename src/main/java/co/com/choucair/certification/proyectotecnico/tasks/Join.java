package co.com.choucair.certification.proyectotecnico.tasks;

import co.com.choucair.certification.proyectotecnico.userinterface.ChoucairAcademyJoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Join implements Task {

    public static Performable thePage() {
        return Tasks.instrumented(Join.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(ChoucairAcademyJoinPage.JOIN_BUTTON));


    }



}
