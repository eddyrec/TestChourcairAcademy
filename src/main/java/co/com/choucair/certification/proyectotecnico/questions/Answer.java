package co.com.choucair.certification.proyectotecnico.questions;

import co.com.choucair.certification.proyectotecnico.userinterface.ChoucairAcademyRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String strComplete;

    public  Answer (String strComplete){
        this.strComplete = strComplete;
    }

    public static Answer toThe(String strComplete) {
        return new Answer(strComplete);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse= Text.of(ChoucairAcademyRegisterPage.CHECK_COMPLETE).viewedBy(actor).asString();
        if (nameCourse.contains(strComplete)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}

