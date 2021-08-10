package co.com.choucair.certification.proyectotecnico.tasks;

//Importaciones
import co.com.choucair.certification.proyectotecnico.userinterface.ChoucairAcademyUtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private ChoucairAcademyUtestPage choucairAcademyPage;
    public static Performable thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    //Abre pagina de Choucair Academy
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(choucairAcademyPage));
    }
}